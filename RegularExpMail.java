package com.RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpMail {
    public void isValid(String mail){
        Pattern p=Pattern.compile("[a-zA-Z][a-zA-Z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher m=p.matcher(mail);
        if (m.matches()){
            System.out.println("valid mail");
        }else {
            System.out.println("invalid mail");
        }
    }

    public static void main(String[] args) {
      RegularExpMail r=new RegularExpMail();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a email id: ");
        String mail= sc.next();
        r.isValid(mail);
    }
}
