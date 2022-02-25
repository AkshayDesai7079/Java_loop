package com.RegularExpression;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        //StringTokenizer st=new StringTokenizer("akshay subhash desai");
        StringTokenizer st=new StringTokenizer("1,99,444,333",",");

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
