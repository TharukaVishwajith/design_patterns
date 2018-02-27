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
public class NewStock implements Stock {

    int id;

    public NewStock(int id) {
        this.id = id;
    }

    @Override
    public int getStockId() {
        return id;
    }

    @Override
    public void getNotify(double priceA, double priceB) {
        System.out.println("Price A is: " + priceA);
        System.out.println("Price B is: " + priceB);
    }

}
