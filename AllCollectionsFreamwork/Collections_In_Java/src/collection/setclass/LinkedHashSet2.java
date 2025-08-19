package collection.setclass;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs1=new LinkedHashSet<String>();
        lhs1.add("HP"); lhs1.add("Acer"); lhs1.add("Lenovo");   lhs1.add("Asus");
        System.out.println(lhs1);
        Iterator<String> i1=lhs1.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }
    }
}
