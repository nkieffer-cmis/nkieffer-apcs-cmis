public class MyBoxApp
{
    public static void main(String[] args){
        MyBox box1 = new MyBox("red");
        MyBox box2 = new MyBox("blue", "secret");
        MyBox box3 = new MyBox("green", "open sesame");
        box3.lock();
        box2.open();
        box2.replaceContent("a fish");
        box1.lock();
        box1.changeKey("a cat");
        box1.unlock(null);
        box1.open();
        box1.replaceContent(box2.getContent());
        box3.replaceContent(box2.getContent());
        box3.unlock("open sesame");
        box1.shake();
        box2.lock();
        box2.replaceContent("a cat");
        box3.open();
        String a = box3.getContent();
        box1.close();
        box2.shake();
        box3.unlock("open sesame");
        box1.lock();
        box2.open();
        box3.replaceContent(box2.getContent() + " " + a);
        box3.lock();
        box1.unlock("a cat");
        box1.shake();
        box1.close();
        System.out.println(box1);
        System.out.println(box2);        
        System.out.println(box3);
    }
}
