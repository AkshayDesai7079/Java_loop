package com.File;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOStreamCharC {
    public static void main(String[] args) {
        FileReader fileReader=null;
        FileWriter fileWriter=null;

        try{
            fileReader=new FileReader("c.txt");
            fileWriter=new FileWriter("char.txt");

            int c;
            while ((c=fileReader.read())!=-1){
                fileWriter.write(c);
            }
            fileReader.close();
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
