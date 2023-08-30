package entities;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean staticProductPredicate(Product product) {
        return product.getPrice() <= 100;
    }

    public boolean nonStaticProductPredicate() {
        return price <= 100;
    }

    public static void staticProductConsumer(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }

    public void nonStaticProductConsumer() {
        price *= 1.2;
    }

    public static String staticProductFunction(Product product) {
        return product.getName().toUpperCase();
    }

    public String nonStaticProductFunction() {
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        return "Product: " + name + ", " + String.format("%.2f", price);
    }
}
