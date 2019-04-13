public class Thing extends Entity
{
    private int weight;
    public Thing(){
        super("default");
    }
    
    public Thing(String name, int age, int weight){
        super(name, age);
        this.weight = weight;
        
        
    }
    
    public String toString(){
        String out = super.toString();
        out += "->Thing";
        return out;
    }
}
