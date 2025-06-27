package app.service;
import  app.model.Product;
import app.repository.ProductRepository;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService() {
        this.productRepository = new ProductRepository();
    }

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    public Product getProductByCode(String code) {
        return productRepository.getProductByCode(code);
    }

    public void removeProduct(String code) {
        productRepository.removeProduct(code);
    }

    public void printAllProducts() {
        for (Product product : productRepository.getAllProducts()) {
            System.out.println("Name: " + product.getName());
            System.out.println("Code: " + product.getCode());
            System.out.println("Price: " + product.getPrice());
            System.out.println("-----------------------------");
        }
    }
}
