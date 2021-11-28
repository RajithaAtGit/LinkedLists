package com.gtrxone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer; // reference
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int number : intList) {
            System.out.println(intList.indexOf(number) + ": " + number);
        }

        intList.add(1, 2);

        for (int number : intList) {
            System.out.println(intList.indexOf(number) + ": " + number);
        }
    }
}
