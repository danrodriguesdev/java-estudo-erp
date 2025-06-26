package app.controller;

import app.model.Customer;
import app.service.CustomerService;

public class CustomerController {
    private CustomerService customerService;

    // Construtor: inicializa o serviço
    public CustomerController() {
        this.customerService = new CustomerService();
    }

    // Adiciona um novo cliente
    public void addCustomer(String name, String cpf, String phone) {
        Customer customer = new Customer(name, cpf, phone);
        customerService.addCustomer(customer);
    }

    // Busca um cliente pelo CPF
    public Customer getCustomerByCpf(String cpf) {
        return customerService.getCustomerByCpf(cpf);
    }

    // Remove um cliente pelo CPF
    public void removeCustomer(String cpf) {
        customerService.removeCustomer(cpf);
    }

    // Imprime todos os clientes cadastrados
    public void printAllCustomers() {
        customerService.printAllCustomers();
    }
}
