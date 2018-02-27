package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus PC on 1/25/2017.
 */
public class Brocker {

        private List<Order> orderList = new ArrayList<>();

        public void takeOrder(Order order){
            orderList.add(order);
        }

        public void placeOrders(){

            for (Order order : orderList) {
                order.execute();
            }
            orderList.clear();
        }
}