package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    private static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        int[] mynumber=getInteger(5);
        for(int i=0;i<mynumber.length;i++){
            System.out.println("elements are "+i+"the numbers are "+mynumber[i]);
        }
        int[] sorted=getSorted(mynumber);
        printArray(sorted);

    }

    public static int[] getInteger(int number){
        int[] values=new int[number];
        System.out.println("Enter "+number+"integer values");
        for(int i=0;i<values.length;i++){

            values[i]=scan.nextInt();
        }
        return values;
    }
    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println("Elements "+i + "contents"+array[i]);
        }
    }
    public static int[] getSorted(int[] array){
    //    int[] sortedArray=new int[array.length];

    //    for(int i=0;i<array.length;i++){
     //       sortedArray[i]=array[i];
      //  }
        int[] sortedArray= Arrays.copyOf(array,array.length);
        boolean flag=true;
        int temp;

        while(flag){
            flag=false;

            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }

}
