package com.pluralsight;


import com.pluralsight.finance.*;

public class TheApp {
    public static void main(String[] args) {
        BankAccount checking = new BankAccount("Checking", "1111", 500.00);
        CreditCard visa = new CreditCard("Visa", "2222", 250.00);
        Jewelry ring = new Jewelry("Ring", 1200.0, 18);

        System.out.println("Checking value: " + checking.getValue());
        System.out.println("Visa value: " + visa.getValue());
        System.out.println("Ring value: " + ring.getValue());
    }

}
