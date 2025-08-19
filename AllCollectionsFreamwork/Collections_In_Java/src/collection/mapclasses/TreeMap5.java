package collection.mapclasses;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap5 {
    public static void main(String[] args) {
        TreeMap tm1=new TreeMap();
        tm1.put(202,"A");   tm1.put(101,"D");
        tm1.put(505,"B");   tm1.put(303,"E");
        tm1.put(404,"C");
        SortedMap hem1=tm1.headMap(303);
        SortedMap tem1=tm1.tailMap(303);
        TreeMap tm2=new TreeMap(hem1);
        TreeMap tm3=new TreeMap(tem1);
        System.out.println(tm1);
        System.out.println(tm2);
        System.out.println(tm3);
    }
}
