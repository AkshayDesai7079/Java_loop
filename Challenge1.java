package com.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge1 {
    public static void main(String[] args) {
        String challengeA="I want a bike";

        String regExp="I want a \\w+.";
        System.out.println(challengeA.matches(regExp));

        String regExp1="I want a (bike|ball)";
        System.out.println(challengeA.matches(regExp1));

        String chal="abcd.135uvqz.tzik.999";
        Pattern p=Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher m=p.matcher(chal);
        while (m.find()){
            System.out.println(m.group());
        }


        String ch1 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern p1 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher m1 = p1.matcher(ch1);
        while(m1.find()) {
            System.out.println("Occurrence: start = " + m1.start(1) + " end = " + (m1.end(1) -1));
        }

        String ch2 = "{0, 2}, {0, 5}, {1, 3}, {2, 4} {x, y}, {6, 34}, {11, 12}";
        Pattern p2 = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher m2 = p2.matcher(ch2);
        while(m2.find()) {
            System.out.println("Occurrence: " + m2.group(1));
        }

    }
}
