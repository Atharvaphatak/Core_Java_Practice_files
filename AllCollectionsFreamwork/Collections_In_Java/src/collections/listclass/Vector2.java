package collections.listclass;

import java.sql.SQLOutput;
import java.util.Vector;

public class Vector2 {
    public static void main(String[] args) {
        Vector<String> v1=new Vector<String>();
        v1.add("A");    v1.add("B");
        System.out.println(v1);
        System.out.println("---------------------------");
        Vector<String> v2=new Vector<String>(v1);
        v2.add("P");    v2.add("Q");
        System.out.println(v2);
        System.out.println("----------------------------");
        Vector<String> v3=new Vector<String>();
        v3.addAll(v2);
        v3.add("Y");    v3.add("Z");
        System.out.println(v3);
    }
}
