import java.util.Scanner;
import java.util.*;
public class TheSystem
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name of the restaurant? ");
        String restaurantName = scanner.nextLine();
        Restaurant restaurant = new Restaurant(restaurantName);
        boolean another = true;
        List<Customer> s = new ArrayList<Customer>();
        while(another){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Table #: ");
            int tableNumber = Integer.parseInt(scanner.nextLine());
            Customer customer = new Customer(name, tableNumber);
            System.out.format("How many orders for %s? ", name);
            
            int nOrders = Integer.parseInt(scanner.nextLine());
            while(nOrders > 0){
                System.out.print("Order Name: ");
                String orderName = scanner.nextLine();
                System.out.print("Price: ");
                int price = Integer.parseInt(scanner.nextLine());
                Order order = new Order(orderName, price);
                customer.addOrder(order);
                nOrders--;
            }
            
            restaurant.addCustomer(customer);
            
            System.out.print("Add another customer? ");
            another = scanner.nextLine().equals("y");
        }         
        
        System.out.println(restaurant);
        System.out.format("The total revenue at %s is %d\n", restaurant.getName(), restaurant.getTotalRevenue());
        
        System.out.println("Customer Summary");
        List<Customer> customers = restaurant.getCustomers();
        for(Customer customer : customers){
            System.out.println(customer+"\n");
        }
    }
}
