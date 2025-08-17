package collections.listclass;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCursor1 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("Cyber"); al.add("Success"); al.add("Training");
        Iterator i=al.iterator();
        while(i.hasNext())
        {
            String s=(String) i.next();
            System.out.println(s);
        }
    }
}
