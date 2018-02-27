/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

/**
 *
 * @author Asus PC
 */
public class ObserverDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Publisher stockPublisher = new StockPublisher();
        
        Stock s1 = new NewStock(1);
        Stock s2 = new NewStock(2);
        Stock s3 = new NewStock(3);
        
        stockPublisher.register(s1);
        stockPublisher.register(s2);
        stockPublisher.register(s3);
        
        
        stockPublisher.setPriceA(100);
        stockPublisher.setPriceB(50);
        stockPublisher.notifyPrices();
        
        stockPublisher.notifyPrices();
    }
    
}
