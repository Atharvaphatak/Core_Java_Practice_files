package collection.mapclasses;

import java.util.LinkedHashMap;

public class LinkedHashMap2 {
    public static void main(String[] args) {
        //Boolean-> False->retrived->Insertion order
        LinkedHashMap lhm1=new LinkedHashMap(10,0.5f,false);
        lhm1.put(101,'x');  lhm1.put(202,'y');  lhm1.put(303,'z');
        lhm1.get(200);
        System.out.println(lhm1);
        //Boolean -> true-> retrived-> AccessOrder
        LinkedHashMap lhm2=new LinkedHashMap(10,0.5f,true);
        lhm2.put(101,'x');  lhm2.put(202,'y');  lhm2.put(303,'z');
        lhm2.get(200);
        System.out.println(lhm2);
    }
}
