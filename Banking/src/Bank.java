import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name){
        for (Branch branch : branches){
            if(branch.getName().equals(name)){
                return false;
            }
        }
        branches.add(new Branch(name));
        return true;
    }

    public boolean addCustomer(String b_name, String c_name, double transaction){
        for(Branch branch : branches){
            if(branch.getName().equals(b_name)){
                for(Customer customer : branch.getCustomers()){
                    if(customer.getName().equals(c_name)){
                       return false;
                    }
                }
                branch.newCustomer(c_name, transaction);
                return true;
            }
        }
        return false;
    }

    public boolean addCustomerTransaction(String b_name, String c_name, double transaction){
        for(Branch branch : branches){
            if(branch.getName().equals(b_name)){
                for(Customer customer : branch.getCustomers()){
                    if(customer.getName().equals(c_name)){
                        customer.addTransaction(transaction);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private Branch findBranch(String name){
        for (Branch branch : branches){
            if(branch.getName().equals(name)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String name, boolean transactions){
        int customer_pos = 1;
        int transaction_pos = 1;
        for (Branch branch : branches){
            if (branch.getName().equals(name)){
                System.out.println("Customer details for branch " + name);
                if(!transactions) {
                    for (Customer customer : branch.getCustomers()) {
                        System.out.println("Customer: " + customer.getName() +"[" + customer_pos + "]");
                        customer_pos++;
                    }
                }else{
                    for (Customer customer : branch.getCustomers()){
                        System.out.println("Customer: " + customer.getName() +"[" + customer_pos + "]");
                        System.out.println("Transactions");
                        for(int i=0; i < customer.getTransactions().size(); i++){
                            System.out.println("[" + transaction_pos + "]" + "  Amount " + customer.getTransactions().get(i));
                            transaction_pos++;
                        }
                        customer_pos++;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
