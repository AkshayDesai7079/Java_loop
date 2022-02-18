package com.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamByte {
    public static void main(String[] args) throws Exception {
        FileInputStream infile=null;
        FileOutputStream ofile=null;
        byte[] arr={'S','R','H','L','P','W'};

             try {
                infile = new FileInputStream("a.txt");//get input from file
                ofile = new FileOutputStream("aa.txt");//output

                ofile.write(arr);

                int ch;//variable holds byte value
                while ((ch = infile.read()) != -1) {


                    ofile.write(ch);// writes the inputs of a.txt
                    System.out.println((char) ch);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("==============================");


            try {
                infile = new FileInputStream("aa.txt");

                int ch;

                while ((ch = infile.read()) != -1) {
                    System.out.println((char) ch);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        infile.close();
        ofile.close();
    }
}
