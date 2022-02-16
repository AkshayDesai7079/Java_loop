package org.excetions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exp {
    public static void main(String[] args) {
        int result=divide();
        System.out.println(result);
    }

    public static int divide(){
        int x;
        int y;
        try {
            x=getInt();
            y=getInt();
        }catch (NoSuchElementException e){
            throw new ArithmeticException("no suitable input");
        }
        //int x=getInt();
        //int y=getInt();
        try {
            System.out.println("X "+x+" Y"+y);
            return x/y;
        }catch (ArithmeticException e){
            throw new ArithmeticException("attempt to divide by zero");
        }


    }
    public static int getInt(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a integer ");
        while (true){
            try {
                return scanner.nextInt();
            }catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("please enter a number using only the digits 0 to 9");

            }
        }
    }
}
