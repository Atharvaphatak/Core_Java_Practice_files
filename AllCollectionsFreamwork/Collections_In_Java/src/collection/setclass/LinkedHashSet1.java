package collection.setclass;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet lhs1=new LinkedHashSet();
        lhs1.add(100);   lhs1.add(200);
        System.out.println(lhs1);
        lhs1.add('X');  lhs1.add("Cyber");
        System.out.println(lhs1);
        lhs1.add(100);  lhs1.add(null);
        System.out.println(lhs1);
    }
}
