import java.util.*;
public class FF
{
    public static void main(String[] argv){
        List<String> strings = new ArrayList<String>();
        strings.add("a");
        strings.add("aa");
        strings.add("aaa");
        strings.add("aaa");
        strings.add("aaaaa");
        strings.add("aaaaaa");
        strings.add("aaaaaaa");
        strings.add("aaaaaaaa");
        strings.add("aaaaaaaaa");
        for(int i = 0; i < strings.size();i++){
            String s = strings.get(i);
            if(s.equals("aaa")){
                strings.remove(s);
            }
            System.out.println(strings.size());
        }
        
        for(String s:strings){
            System.out.println(s);
        }
    }
}
