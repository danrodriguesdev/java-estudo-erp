package app.model;

public class Product {
    private String name;
    private String code;
    private double price;

    public Product() {}
    public Product(String name, String code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }


    //Getters Product
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getCode() {
        return code;
    }


    // Setters Product
    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
