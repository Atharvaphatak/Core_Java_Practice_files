package collection.setclass;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> hs1=new HashSet<String>();
        hs1.add("Cyber"); hs1.add("Success"); hs1.add("Training");
        System.out.println(hs1);
        Iterator<String> i=hs1.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
