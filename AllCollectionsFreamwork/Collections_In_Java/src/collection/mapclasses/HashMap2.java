package collection.mapclasses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(303,"Atharva");
        hm.put(101,"Rohan");
        hm.put(202,"Harsh");
        System.out.println(hm);
        Set s=hm.keySet();
        System.out.println(s);
        Collection c=hm.values();
        System.out.println(c);
    }
}
