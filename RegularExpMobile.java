package com.RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpMobile {
    public void isValid(String number){
       // Pattern p=Pattern.compile("[7-9][0-9]{9}");
        Pattern p=Pattern.compile("0|91?[7-9][0-9]{9}");

        Matcher m=p.matcher(number);
        if (m.matches()){
            System.out.println("Valid number");
        }else {
            System.out.println("invalid");
        }
    }

    public static void main(String[] args) {
        RegularExpMobile r=new RegularExpMobile();
        Scanner sc=new Scanner(System.in);

        while (true){
            System.out.println("Enter a mobile number");
            String number= sc.next();
            r.isValid(number);
        }
    }
}
