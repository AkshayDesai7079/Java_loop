package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static GroceryList groceryList=new GroceryList();

    public static void main(String[] args) {
        boolean quiet=false;
        int choice=0;

        printInstructions();

        while (!quiet){
            System.out.println("Enter ypur choice");
            choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGrocery();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArraylist();
                    break;
                case 7:
                    quiet=true;
                    break;

            }
        }

    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item");
        groceryList.addGrocery(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.print("Current item name: ");
        String itemNo=scanner.nextLine();
        System.out.print("Enter new item");
        String newItem=scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo,newItem);
    }
    public static void removeItem(){
        System.out.print("Enter a item ");
        String itemNo=scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }
    public static void searchForItem(){
        System.out.print("Item to search");
        String searchItem=scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.print("Found"+searchItem);
        }else {
            System.out.println(searchItem +" , not on file");
        }

    }
    public static void processArraylist(){
        ArrayList<String> newArray=new ArrayList<String>();
        newArray.addAll(groceryList.getGrocerylist());

        ArrayList<String> nextArray=new ArrayList<String>(groceryList.getGrocerylist());

        String[] myArray = new String[groceryList.getGrocerylist().size()];
        myArray=groceryList.getGrocerylist().toArray(myArray);
    }
}
