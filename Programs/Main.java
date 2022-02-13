package com.example.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank=new Bank("akshay");
        bank.deposit(1000);
        bank.withdraw(300);
        bank.withdraw(200);
        bank.deposit(1000);
        bank.withdraw(200);
        bank.withdraw(-200);
        bank.deposit(-1000);
        bank.deposit(2000);
        bank.calculateBalance();
       // bank.balance=2000;//we add the balance here because we use the public modifier
                            // this is a wrong method to used the public modifier for sequrity
                            // so use private
      //  System.out.println("balance amount is after add "+bank.getBalance());
       // bank.transactions.add(6788);
      //  bank.calculateBalance();

    }
}
