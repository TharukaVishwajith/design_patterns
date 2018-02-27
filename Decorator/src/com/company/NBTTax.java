package com.company;

/**
 * Created by Asus PC on 1/25/2017.
 */
public class NBTTax implements Bill {

    Bill bill;

    public NBTTax(Bill bill){
        this.bill = bill;
    }

    @Override
    public double getotal() {
        return this.bill.getotal()*1.25;
    }
}
