package app.service;
import app.model.Customer;
import app.repository.CustomerRepository;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService() {
        this.customerRepository = new CustomerRepository();
    }
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }

    public Customer getCustomerByCpf(String cpf) {
        return customerRepository.getCustomerByCpf(cpf);
    }

    public void removeCustomer(String cpf) {
        customerRepository.removeCustomer(cpf);
    }

    public void printAllCustomers() {
        for (Customer customer : customerRepository.getAllCustomers()) {
            System.out.println("Name: " + customer.getName());
            System.out.println("CPF: " + customer.getCpf());
            System.out.println("Phone: " + customer.getPhone());
            System.out.println("-----------------------------");
        }
    }
}
