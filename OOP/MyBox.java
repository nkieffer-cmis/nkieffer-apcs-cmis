public class MyBox
{
    private String color;
    private String content;
    private boolean isLocked;
    private boolean isOpen;
    private String key;
    
    public MyBox(String color){
        this.color = color;
    }
    
    public MyBox(String color, String key){
        this(color);
        this.key = key;
    }
    
    public void unlock(String enteredKey){
        if(enteredKey != null){
            if(key != null && enteredKey.equals(key)){
                isLocked = false;
            }
        } else if (key == null){
            isLocked = false;
        }
    }
    
    public void lock(){
        if(!isOpen){
            isLocked = true;
        }
    }
    
    public void open(){
        if(!isLocked){
            isOpen = true;
        }
    }
    
    public void close(){
        isOpen = false;
    }
    
    public String getContent(){
        if(isOpen){
            return content;
        }else{
            return null;
        }
    }
        
    public void replaceContent(String newContent){
        if(isOpen){
            content = newContent;
        }
    }
    
    public boolean shake(){
        if(isOpen){
            content = null;
        }
        return content != null;
    }
    
    public void changeKey(String newKey){
        if(!isLocked){
            key = newKey;
        }
    }
    
    public String toString(){
        String lockState, lidState, contentState;
        if(isLocked)
            lockState = "locked";
        else
            lockState = "unlocked";
        
        if(isOpen)
            lidState = "open";
        else
            lidState ="closed";
        
        if(isOpen){
            if(content != null)
                contentState = "containing " + content;
            else
                contentState = "with no contents";
        }else{
            contentState = "with unknown contents";
        }
        String out = String.format("A %s, %s, %s, MyBox %s.", color, lockState, lidState, contentState);
        return out;
    }
}
