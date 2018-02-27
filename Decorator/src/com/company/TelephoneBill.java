package com.company;

/**
 * Created by Asus PC on 1/25/2017.
 */
public class TelephoneBill implements Bill {


    double minits;
    double noOfSms;

TelephoneBill(int minits,int noOfSms){
    this.minits = minits;
    this.noOfSms = noOfSms;
}

    @Override
    public double getotal() {
       return minits*2+noOfSms*0.37;
    }
}
