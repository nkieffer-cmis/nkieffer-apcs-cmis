public class LawnMower extends Machine
{

    private int grassToCut;
    public LawnMower(int energy, int grassToCut){
        super();
        while(energy > 0){
            incEnergy();
        }
        this.grassToCut = grassToCut;
    }
    
    public void start(){
        decEnergy();
        setRunning(true);
    }
    
    public void stop(){
        setRunning(false);
    }
    
    public int operate(){
        int amountCut = 0;
        if(isRunning()){
            decEnergy();
            amountCut = (int)(Math.random() * 10);
            grassToCut -= amountCut;
        }
        return amountCut;
        
    }

}
