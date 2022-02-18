package com.File;

import java.io.*;

public class CopyFileLine {
    public static void main(String[] args)throws IOException {
        BufferedReader is=null;
        PrintWriter pw=null;

        try{
            is=new BufferedReader(new FileReader("a.txt"));
            pw=new PrintWriter(new FileWriter("z.txt"));

            String line;

            while ((line=is.readLine())!=null);{
                //System.out.println(line);
                pw.println(line);
            }
           // is.close();
           // pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(is!=null){
                is.close();
            }
            if(pw!=null){
                pw.close();
            }
        }

    }
}
