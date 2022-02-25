package com.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp3 {
    public static void main(String[] args) {
      //  Pattern p=Pattern.compile("\\s");//space character
      //  Pattern p=Pattern.compile("\\d");
       // Pattern p=Pattern.compile("\\w");
       // Pattern p=Pattern.compile("\\.");
        Pattern p=Pattern.compile("a?");
        Matcher m=p.matcher("a1aab.aa aaaa7@z#");

        while (m.find()){
            System.out.println(m.start()+"---"+m.group());
        }
    }
}
