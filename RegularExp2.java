package com.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp2 {
    public static void main(String[] args) {
        //Pattern p=Pattern.compile("[^abc]");
        //Pattern p=Pattern.compile("[^abc]");
        //Pattern p=Pattern.compile("[a-z]");
        //Pattern p=Pattern.compile("[a-zA-Z]");
        Pattern p=Pattern.compile("[0-9]");
        Matcher m=p.matcher("a17@hab945a#");
        while (m.find()){
            System.out.println(m.start()+"----"+m.group());
        }
    }
}
