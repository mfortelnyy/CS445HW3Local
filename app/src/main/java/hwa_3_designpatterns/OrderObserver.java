/*
 * Order Processing (Observer Pattern)
 * OrderObserver.java (Observer Interface)
 */
package hwa_3_designpatterns;

public interface OrderObserver {
    void update(String orderNumber, double totalAmount);
}
