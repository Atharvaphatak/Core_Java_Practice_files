package collection.mapclasses;

import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap tm1=new TreeMap();
        tm1.put(200,'x');
        tm1.put(400,null);
        tm1.put(100,'y');
        tm1.put(300,'z');
        System.out.println(tm1);
        //tm1.put(null,'z');->Error
        //tm.put('x'.'z');-> Error
    }
}
