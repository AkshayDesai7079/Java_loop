package com.RegularExpression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RugularExpMobileF {
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter("akshay.txt");
            BufferedReader br = new BufferedReader(new FileReader("a.txt"));
            Pattern p=Pattern.compile("[7-9][0-9]{9}");
            String l=br.readLine();
            while (l!=null){
                Matcher m= p.matcher(l);
                while (m.find()){
                    System.out.println(m.group());
                }
                l=br.readLine();
            }
            out.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
