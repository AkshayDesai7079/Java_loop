package com.RegularExpression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpMailF {
    public static void main(String[] args) {
        try {
            PrintWriter p=new PrintWriter("a.txt");
            BufferedReader r=new BufferedReader(new FileReader("akshay.txt"));
            Pattern pp=Pattern.compile("[a-zA-Z][a-zA-Z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
            String line=null;
            while ((line= r.readLine())!=null){
                Matcher m=pp.matcher(line);
                while (m.find()){
                    System.out.println(m.group());
                }
                line=r.readLine();
            }
            p.flush();

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
