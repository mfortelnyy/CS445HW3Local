/*
 * Shopping Cart (Strategy Pattern)
 * PayPalPayment.java (Concrete Strategy)
 */

 package hwa_3_designpatterns;

 public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;
    private String msg;
    
    
    
    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
       
    }

    @Override
    public void pay(double amount) {
        this.msg = String.format("Paid: %.2f", amount);;
    }
    
    @Override
    public String getMsg(){
        return msg;
    }

}
