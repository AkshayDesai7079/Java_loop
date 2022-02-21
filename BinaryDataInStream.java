package com.File;

import java.io.*;

public class BinaryReader {
    public static void main(String[] args) {
        try{
            FileInputStream file=new FileInputStream("f.dat");
            DataInputStream in=new DataInputStream(file);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            boolean eof=false;

            int count=1;
            int flag=0;
            int reg;
            String name, name2;
            System.out.println("enter a name of student ");
            name2=br.readLine();
            while (!eof){
                try {
                    name=in.readUTF();
                    reg=in.readInt();
                    if (name.equals(name2)){
                        System.out.println("Name..."+name);

                        System.out.println("Reg...."+reg);

                        flag=1;
                        break;
                    }
                }catch (IOException e){
                    e.printStackTrace();
                    eof=true;
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
