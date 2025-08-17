package collection.mapclasses;

import java.util.*;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(303,"Atharva");
        hm.put(101,"Rohan");
        hm.put(202,"Harsh");
        Set s= hm.entrySet();
        Iterator i=s.iterator();
       while(i.hasNext())
       {
           Map.Entry me=(Map.Entry)i.next();
           System.out.println(me.getKey()+" - "+me.getValue());
       }
    }
}
