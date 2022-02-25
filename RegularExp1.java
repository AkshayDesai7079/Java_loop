package com.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp1 {
    public static void main(String[] args) {
        int count=0;
        Pattern p=Pattern.compile("ab");
        Matcher m=p.matcher("abcdbbabbbab");

        while (m.find()){
            count++;
            System.out.println(m.start()+"==="+m.end()+"==="+m.group());
        }
    }
}
