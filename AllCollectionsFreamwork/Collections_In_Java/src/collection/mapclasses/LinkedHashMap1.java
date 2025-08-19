package collection.mapclasses;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap lhm1=new LinkedHashMap();
        lhm1.put(101,"Cyber");
        lhm1.put(202,"Success");
        System.out.println(lhm1);
        lhm1.put('X',111);
        lhm1.put(true,222.5f);
        System.out.println(lhm1);
        lhm1.put(null,true);
        lhm1.put(null,false);
        System.out.println(lhm1);
    }
}
