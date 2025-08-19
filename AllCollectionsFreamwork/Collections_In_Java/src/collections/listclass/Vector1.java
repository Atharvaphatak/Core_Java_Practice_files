package collections.listclass;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(100);     v.add(200);
        System.out.println(v);
        v.add('X');     v.add('Z');
        System.out.println(v);
        v.add(null);    v.add(true);
        System.out.println(v);
    }
}
