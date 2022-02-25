package com.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularIdentifier {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[a-zA-Z][a-zA-Z0-9-#]+");
        Matcher m=p.matcher("akshay");
        if (m.matches()){
            System.out.println("valid identifer");
        }
        else {
            System.out.println("invalid");
        }
    }
}
