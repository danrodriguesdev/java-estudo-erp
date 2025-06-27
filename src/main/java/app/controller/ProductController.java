package app.controller;
import app.model.Product;
import app.service.ProductService;

public class ProductController {
    private ProductService productService;

    public  ProductController(ProductService productService) {
        this.productService = productService;
    }
    public void addProduct(Product product) {
        productService.addProduct(product);
    }
    public Product getProductByCode(String code) {
        return productService.getProductByCode(code);
    }
    public void removeProduct(String code) {
        productService.removeProduct(code);
    }
}
