package app;
import java.util.Scanner;
import app.controller.CustomerController;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Enter customer phone: ");
        String phone = scanner.nextLine();


        CustomerController controller = new CustomerController();
        controller.addCustomer(name, cpf, phone);

        controller.printAllCustomers();
    }
}

