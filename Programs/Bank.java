package com.example.bank;

import java.util.ArrayList;

public class Bank {
    private String accountName;
    private int balance=0;
    private ArrayList<Integer> transactions;

    public Bank(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
        System.out.println("this is "+this.accountName+" account");
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if (amount>0){
            this.balance=balance+amount;
            System.out.println(amount+" deposited amount is now "+this.balance);

        }else {
            System.out.println("cannot deposit negative sums");
        }
    }
    public void withdraw(int amount){
        int withdrawal=-amount;
        if(withdrawal<0){
            this.transactions.add(withdrawal);
            this.balance=balance+withdrawal;
            System.out.println(amount +" withdrawn balance is now "+this.balance);
        }else {
            System.out.println("cannot withdrawn negative sums");
        }
    }

    public void calculateBalance(){
        this.balance=0;
        for(int i:this.transactions){
            this.balance=this.balance+i;
        }
        System.out.println("calculate balance is "+this.balance);
    }
}
