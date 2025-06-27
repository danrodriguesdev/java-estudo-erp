package app;
import java.util.Scanner;
import app.controller.CustomerController;
import app.controller.ProductController;
import app.model.Product;
import app.service.ProductService;


public class Main {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Enter customer phone: ");
        String phone = scanner.nextLine();


        CustomerController controller = new CustomerController();
        controller.addCustomer(name, cpf, phone);

        controller.printAllCustomers();*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Product Name: ");
        String name = scanner.nextLine();

        System.out.println("Product Code: ");
        String code = scanner.nextLine();

        System.out.println("Product Price: ");
        String priceInput = scanner.nextLine();
        double price = Double.parseDouble(priceInput);

        ProductService productService = new ProductService();
        ProductController productController = new ProductController(productService);

        Product product = new Product(name, code, price);
        productController.addProduct(product);
    }
}

