/* 
 * Product Catalog (Factory Method Pattern)
 * ElectronicsFactory.java (Concrete Factory)
 */
package hwa_3_designpatterns;

public class ElectronicsFactory implements ProductFactory {
    
    @Override
    public Product createProduct(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }
        if (type.equalsIgnoreCase("Laptop")) {
            return new Laptop("Laptop", 999.99); 
        } else if (type.equalsIgnoreCase("Phone")) {
            return new Phone("Phone", 499.99); 
        } else {
            return null; 
        }
    }
}
