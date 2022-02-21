package com.File;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File2 {
    public static void main(String[] args) throws IOException {
        File infile=new File("akshay.txt");
        FileReader fr=null;
        try {
            fr=new FileReader(infile);
            int c;
            while ((c=fr.read())!=-1){
                System.out.println((char) c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            fr.close();
        }
    }
}
