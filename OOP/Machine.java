public abstract class Machine
{
    private int energy;
    private boolean running;
    public abstract int operate();
    public abstract void start();
    public abstract void stop();
    
    public boolean isRunning(){
        return running;
    }
    
    public void setRunning(boolean isRunning){
        running = isRunning;
    }
    
    public void incEnergy(){
        energy++;
    }
    
    public void decEnergy(){
        energy--;
    }
        
}
