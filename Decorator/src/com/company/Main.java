package com.company;

public class Main {

    public static void main(String[] args) {

        Bill bill = new MyTax(new NBTTax(new TelephoneBill(10,20)));
        System.out.println(bill.getotal());
        
    }
}
