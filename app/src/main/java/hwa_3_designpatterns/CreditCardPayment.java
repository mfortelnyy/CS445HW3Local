/*
 * Shopping Cart (Strategy Pattern)
 * CreditCardPayment.java (Concrete Strategy)
 */
package hwa_3_designpatterns;

 public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cvv;
    private String expiryDate;
    private String msg;

    public CreditCardPayment(String cardNumber, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        this.msg = "Paid: " + String.format("%.2f", amount);
    }

    @Override
    public String getMsg() {
        return msg;
    }

}

