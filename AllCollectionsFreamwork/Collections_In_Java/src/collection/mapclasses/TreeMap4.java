package collection.mapclasses;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap4 {
    public static void main(String[] args) {
        TreeMap tm1=new TreeMap();
        tm1.put(202,"A");   tm1.put(101,"D");
        tm1.put(505,"B");   tm1.put(303,"E");
        tm1.put(404,"C");
        System.out.println(tm1);
        System.out.println("-----------------------");
        SortedMap sm1=tm1.headMap(303);
        System.out.println(sm1);
        System.out.println("-----------------------");
        SortedMap sm2=tm1.tailMap(303);
        System.out.println(sm2);
    }
}
