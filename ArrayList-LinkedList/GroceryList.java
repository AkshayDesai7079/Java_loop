package Array;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> grocerylist=new ArrayList<String>();

    public void addGrocery(String item){
        grocerylist.add(item);
    }
    public ArrayList<String> getGrocerylist(){
        return grocerylist;
    }


    public void printGrocery(){
        System.out.println("You have "+grocerylist.size()+" items in your grocery list");
        for(int i=0;i< grocerylist.size();i++){
            System.out.println((i+1)+". "+grocerylist.get(i));
        }
    }
    public void modifyGroceryItem(String currentItem,String newItem){
        int position=findItem(currentItem);
        if(position>=0){
            modifyGroceryItem(position,newItem);
        }
    }
    private void modifyGroceryItem(int position,String newItem){
        grocerylist.set(position,newItem);
        System.out.println("Grocery Itme"+(position+1)+" has been modified");
    }
    public void removeGroceryItem(String item){
        int position=findItem(item);
        if(position>=0){
            removeGroceryItem(position);

        }
    }
    private void removeGroceryItem(int position){
        grocerylist.remove(position);
    }
    private int findItem(String searchItem){
        return grocerylist.indexOf(searchItem);

    }
    public boolean onFile(String searchItem){
        int position=findItem(searchItem);
        if(position>=0){
            return true;
        }
        return false;
    }

}
