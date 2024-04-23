/*
 * Order Processing (Observer Pattern)
 * ShippingDepartment.java (Concrete Observer)
 */

 package hwa_3_designpatterns;

 public class ShippingDepartment implements OrderObserver {
    private String msg;

    @Override
    public void update(String orderNumber, double totalAmount) {
        msg = orderNumber + ": " + String.format("%.2f", totalAmount);
    }

    public String getMsg() {
        return msg;
    }
 }
