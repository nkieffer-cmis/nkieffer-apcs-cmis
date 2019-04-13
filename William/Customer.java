import java.util.*;
public class Customer
{
    private String name;
    private List<Order> orders;
    private int tableNumber;
    
    public Customer(String name, int tableNumber){
        orders = new ArrayList<Order>();
        this.name = name;
        this.tableNumber = tableNumber;
    }
    
    public Customer(String name, int tableNumber, int nOrders){
        this(name, tableNumber);
        for(int i = 0; i < nOrders; i++){
            String orderName = "Order" + i;
            Order order = new Order(orderName, 5);
            orders.add(order);
        }
        
    }
    
    public String getName(){
        return name;
    }
    
    public int getBill(){
        int price = 0;
        for(Order order : orders){
            price += order.getPrice();
        }
        return price;
    }
    
    public int getTip(){
        return (int)(0.15 * getBill());
    }
    public void addOrder(Order newOrder){
        orders.add(newOrder);
    }
    
    public String toString(){
        String orderList = "";
        int n = 1;
        for(Order order: orders){
            orderList += n + ") "+order+ "\n";
            n++;
        }
        int total = getBill() + getTip();
        String out = String.format("Name: %s\nTable #: %d\nOrders\n-------\n%s\n\nBill: %d\n15 pct Tip: %d\nTotal: %d", name, tableNumber, orderList, getBill(), getTip(), total);
        return out;
    }
    
    
}
