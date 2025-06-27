package app.repository;
import app.model.Product;
import java.util.List;
import java.util.ArrayList;

public class ProductRepository {
    private List<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }

    public Product getProductByCode(String code) {
        for (Product product : products) {
            if (product.getCode().equals(code)) {
                return product;
            }
        }
        return null; // or throw an exception
    }

    public void removeProduct(String code) {
        products.removeIf(product -> product.getCode().equals(code));
    }
}
