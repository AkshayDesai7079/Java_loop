package com.keyword;

// if ypu use final keyword to class we cannot inherit the class into another class

class aa{
    final public void demo(){
        System.out.println("this is outside class");
    }
}


public class FinalKeyword extends aa {
    final public int num;
    String name;

    public FinalKeyword( String name) {
        this.num = 100;
        this.name = name;
    }
    public void display(){
        System.out.println(num+" "+name);
    }

    // in final method we cannot override the method into another class
    //public void demo(){
     //   System.out.println("hbsah");
    //}

    public static void main(String[] args) {
        FinalKeyword finalKeyword=new FinalKeyword("akshay");
        finalKeyword.display();
        finalKeyword.demo();
    }

}
