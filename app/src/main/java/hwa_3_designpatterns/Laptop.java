package hwa_3_designpatterns;

/*
 * Product Catalog (Factory Method Pattern)
 * Laptop.java (Concrete Product)
 */

public class Laptop implements Product {
    private String name;
    private double price;

    public Laptop(String name, double price) {
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
