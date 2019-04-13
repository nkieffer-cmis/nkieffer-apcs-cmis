public class Idea extends Entity
{
    private int popularity;
    public Idea(){
        super("default");
    }
    
    public Idea(String name, int age){
        super(name, age);
    }
    
    public int getPopularity(){
        return popularity;
    }
    
    public void setPopularity(int newPopularity){
        popularity = newPopularity;
    }
    
    public String toString(){
        String out = super.toString();
        out += "->Idea";
        return out;
    }
}
