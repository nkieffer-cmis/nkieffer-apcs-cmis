public class ThingA implements Moveable, Chargeable
{
    private int x;
    private int y;
    private int batteryLevel = 10;;
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void charge(int level){
        batteryLevel += level;
    }
    public void drain(int level){
        batteryLevel -= level;
    }
    public int getLevel(){
        return batteryLevel;
    }
}
