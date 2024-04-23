/*
 * Product Catalog (Factory Method Pattern)
 * ProductFactory.java (Factory Method)
 */
package hwa_3_designpatterns;

public interface ProductFactory {
    public Product createProduct(String type);
}
