package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int[] demo=reverse(5);

        System.out.println("array"+ Arrays.toString(demo));

        rev(demo);
        System.out.println("Reverse array"+Arrays.toString(demo));

    }
    private static Scanner scanner=new Scanner(System.in);

    public static int[] reverse(int number){
        int[] array=new int[number];

        for (int i=0;i<array.length;i++){

            System.out.println("enter a number");
            int num=scanner.nextInt();
            array[i]=num;
        }
        return array;
    }
    public static void rev(int[] arr){
        int max=arr.length-1;
        int half=arr.length/2;
        for(int i=0;i<half;i++){
            int temp=arr[i];
            arr[i]=arr[max-i];
            arr[max-i]=temp;
        }
    }


}
