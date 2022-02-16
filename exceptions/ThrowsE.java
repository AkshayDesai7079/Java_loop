package org.excetions;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsE {
    public static void main(String[] args) throws Exception {

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter a num1");
        int num1=scanner.nextInt();

        System.out.println("enter a num2");
        int num2=scanner.nextInt();

        try {
            int result;

            result = num1 / num2;

            if (result < 20) {
                throw new Exception("please put greater value");
            }
            System.out.println(result);


        }catch (ArithmeticException e){
            System.out.println(e);
        }


    }
}
