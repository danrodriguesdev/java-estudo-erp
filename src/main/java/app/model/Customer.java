package app.model;

public class Customer {
    private String name;
    private String cpf;
    private String phone;

    //public  Customer() {}
    public Customer(String name, String cpf, String phone) {
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPhone() {
        return phone;
    }



    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}

