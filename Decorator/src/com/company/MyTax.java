package com.company;

/**
 * Created by Asus PC on 1/25/2017.
 */
public class MyTax implements Bill {

    Bill bill;

    MyTax(Bill bill){
        this.bill = bill;
    }

    @Override
    public double getotal() {
        return bill.getotal()*1.4;
    }
}
