import java.util.*;
public class Restaurant
{
    private List<Customer> customers;
    private String name;
    public Restaurant(String name){
        customers = new ArrayList<Customer>();
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    
    public int getTotalRevenue(){
        int sum = 0;
        for(Customer customer: customers){
            sum += customer.getBill();
        }
        return sum;
    }
    
    public List<Customer> getCustomers(){
        return customers;
    }
    
    public String toString(){
        String out = String.format("Name: %s\nNumber of customers: %d", name, customers.size());
        return out;
    }
}
