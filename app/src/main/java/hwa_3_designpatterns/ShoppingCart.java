/*
 * Shopping Cart (Strategy Pattern)
 * ShoppingCart.java (Context)
 */
package hwa_3_designpatterns;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        }
    }
}
