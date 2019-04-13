public class Place extends Entity
{
    private int population;
    public Place(){
        super("default");
    }
    
    public Place(String name, int age){
        super(name, age);
    }
        
    public int getPopulation(){
        return population;
    }
    
    public void setPopulation(int newPopulation){
        population = newPopulation;
    }
    public String toString(){
        String out = super.toString();
        out += "->Place";
        return out;
    }
}

