package com.example;

public abstract class Employee implements Personal{
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public abstract double computePay();

  //  public double computePay(){
   //     System.out.println("Inside Employee computePay");
    //    return 0.0;
  //  }
    public void mailCheck(){
        System.out.println("Mailing a check to "+this.name+" "+this.address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void details() {
        System.out.println("details of employee is :");
        System.out.println("Employee name: "+this.name);
        System.out.println("Employee address: "+this.address);
        System.out.println("Employee number: "+this.number);
    }
}
