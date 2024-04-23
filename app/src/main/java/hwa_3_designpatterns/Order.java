/*
 * Order Processing (Observer Pattern)
 * Order.java (Subject)
 */

package hwa_3_designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderObserver> observers = new ArrayList<>();
    private String orderNumber;
    private double totalAmount;

    public Order(String orderNumber, double totalAmount) {
        this.orderNumber = orderNumber;
        this.totalAmount = totalAmount;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }


    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(orderNumber, totalAmount);
        }
    }

    
    public void processOrder() {
        // simulation
        notifyObservers();
    }
}
