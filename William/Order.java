public class Order
{
    private String name;
    private int price;
    
    public Order(String name, int price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int newPrice){
        price = newPrice;
    }
    
    public String toString(){
        return name + ": " + price;
    }

}
