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
public interface Publisher {

    void register(Stock stock);

    void unregister(Stock stock);

    void notifyPrices();

    void setPriceA(double price);

    void setPriceB(double price);

}
