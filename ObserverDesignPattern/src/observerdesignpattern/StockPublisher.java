/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus PC
 */
public class StockPublisher implements Publisher{
    
     private List<Stock> stocks = new ArrayList<>();
     
     double priceA,priceB;

    @Override
    public void register(Stock stock) {
        stocks.add(stock);
    }

    @Override
    public void unregister(Stock stock) {
        System.out.println("Stock " +stock.getStockId()+" removed!");
        stocks.remove(stock);
    }

    @Override
    public void notifyPrices() {
        for (Stock stock : stocks) {
            System.out.println(stock.getStockId()+" --------------------------");
            stock.getNotify(priceA, priceB);
        }
    }
    
     @Override
    public void setPriceA(double price){
        this.priceA = price;
       // notifyPrices();
    }
     @Override
    public void setPriceB(double price){
        this.priceB = price;
      //  notifyPrices();
    }
    
}
