package app.repository;
import app.model.Customer;
import java.util.List;
import java.util.ArrayList;



public class CustomerRepository {
    private List<Customer> customers;

    public CustomerRepository() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customers);
    }

    public Customer getCustomerByCpf(String cpf) {
        for (Customer customer : customers) {
            if (customer.getCpf().equals(cpf)) {
                return customer;
            }
        }
        return null; // or throw an exception
    }

    public void removeCustomer(String cpf) {
        customers.removeIf(customer -> customer.getCpf().equals(cpf));
    }
}
