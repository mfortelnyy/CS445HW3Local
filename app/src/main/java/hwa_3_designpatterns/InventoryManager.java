/*
 * Order Processing (Observer Pattern)
 * InventoryManager.java (Concrete Observer)
 */

package hwa_3_designpatterns;

import hwa_3_designpatterns.OrderObserver;

public class InventoryManager implements OrderObserver {
    private String msg;

    @Override
    public void update(String orderNumber, double totalAmount) {
        msg = orderNumber + ": " + String.format("%.2f", totalAmount);
    }

    public String getMsg() {
        return msg;
    }
}
