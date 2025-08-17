package collections.listclass;

import java.util.Vector;
import java.util.Enumeration;


public class EnumerationCursor1 {
    public static void main(String[] args) {
        Vector v= new Vector();
        v.add(10);  v.add(20);  v.add(30);
        Enumeration ec=v.elements();
        while(ec.hasMoreElements())
        {
            Integer i=(Integer) ec.nextElement();
            System.out.println(i);
        }

    }
}
