import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double transaction){
        for(Customer customer : customers){
            if(customer.getName().equals(name)){
                return false;
            }
        }

        Customer customer = new Customer(name);
        customer.addTransaction(transaction);

        customers.add(customer);
        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        for (Customer customer : customers){
            if(customer.getName().equals(name)){
                customer.addTransaction(transaction);
                return true;
            }
        }
        return false;
    }

    private Customer findCustomer(String name){
        for (Customer customer : customers){
            if(customer.getName().equals(name)){
                return  customer;
            }
        }
        return null;
    }
}
