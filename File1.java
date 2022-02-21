package com.File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) throws IOException{
      File fout=new File("akshay.txt");
      FileWriter fw=null;
      try {
          fw=new FileWriter(fout);
          String s="Hello Good morning";
          fw.write(s);
          System.out.println("file successufully updated");
      }catch (IOException e){
          e.printStackTrace();
      }finally {
          fw.close();
      }
    }
}
