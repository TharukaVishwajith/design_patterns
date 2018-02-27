package com.company;

/**
 * Created by Asus PC on 1/25/2017.
 */
public class SellStock implements Order {
    Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
