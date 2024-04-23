/*
 * Product Catalog (Factory Method Pattern)
 * Phone.java (Concrete Product)
 */

package hwa_3_designpatterns;

public class Phone implements Product {
    private String name;
    private double price;

    public Phone(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
