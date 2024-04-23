/*
 * Shopping Cart (Strategy Pattern)
 * PaymentStrategy.java (Strategy Interface)
 */
package hwa_3_designpatterns;

public interface PaymentStrategy {
    void pay(double amount);
    public String getMsg();
}

