package org.excetions;

import java.util.Scanner;


public class DivideZeroC {
    public static void add(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a first number ");
            int num1 = scanner.nextInt();

            System.out.println("enter a second number ");
            int num2 = scanner.nextInt();

            int r = num1 / num2;
            System.out.println(r);


        }catch (ArithmeticException e){
            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        add();
    }

}
