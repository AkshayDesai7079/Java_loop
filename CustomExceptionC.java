package org.excetions;


import java.util.Scanner;

class TooYoungException extends Exception {
    public TooYoungException(String msg) {
        super(msg);
    }
}

class TooOldException extends Exception{
    public TooOldException(String msg) {
        super(msg);
    }
}




public class CustomExceptionC {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try{
            System.out.println("enter a name ");
            String name=scanner.next();

            System.out.println("enter a id ");
            int id=scanner.nextInt();

            System.out.println("enter a age ");
            int age=scanner.nextInt();
            try{
                if (age<18){
                    throw new TooYoungException("you are too young");
                }else if(age>80){
                    throw new TooOldException("you are too old");
                }

                System.out.println("name "+name+"id "+id+"age "+age);

            }catch (Exception e){
                e.printStackTrace();
            }



        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
