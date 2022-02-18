package com.File;

import java.io.*;

public class BinaryFile {
    public static void main(String[] args) {
        String name;
        int regNo;

        try{
            FileOutputStream file=new FileOutputStream("f.dat");
            DataOutputStream data=new DataOutputStream(file);
            BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
            for (int i=0;i<4;i++){
                System.out.println("enter a name");
                name=buffer.readLine();
                data.writeUTF(name);

                System.out.println("enter a regNo");
                regNo=Integer.parseInt(buffer.readLine());
                data.writeInt(regNo);
            }
            buffer.close();
            data.close();
            file.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
