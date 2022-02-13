package Practice;

import java.util.Scanner;

public class Practice1 {
    private static Scanner scanner=new Scanner(System.in);
    private String name;
    private String email;
    private long phone;

    public Practice1(String name, String email, long phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public static  void getDetails(){
        System.out.println("Enter a name");
        String name=scanner.nextLine();

        System.out.println("Enter a email");
        String email=scanner.nextLine();

        System.out.println("Enter a phone");
        String phone= String.valueOf(scanner.nextLong());

        System.out.println("name is "+name+" email "+email+" phone "+phone);

    }



    public  float percentage(){
        System.out.println("Enter a sub1");
        int sub1=scanner.nextInt();

        System.out.println("Enter a sub2");
        int sub2=scanner.nextInt();

        System.out.println("Enter a sub3");
        int sub3=scanner.nextInt();

        System.out.println("Enter a sub4");
        int sub4=scanner.nextInt();

        System.out.println("Enter a sub5");
        int sub5=scanner.nextInt();

        System.out.println("Enter a sub6");
        int sub6=scanner.nextInt();


        int total=(sub1+sub2+sub3+sub4+sub5+sub6);

        float perc=total/6;
        System.out.println("Your total is "+total);
        return perc;

    }
/*
    public static void main(String[] args) {
        Practice1 practice1=new Practice1();

        System.out.println("your percenage is "+practice1.percentage());
    }
    
 */

}
