package collection.setclass;

import java.util.HashSet;

public class HashSet3 {
    public static void main(String[] args) {
        HashSet h1=new HashSet();
        h1.add(200);    h1.add(100);
        System.out.println(h1);
        System.out.println("--------------------");
        HashSet h2=new HashSet(h1);
        h2.add('X');    h2.add('Y');
        System.out.println(h2);
        System.out.println("--------------------");
        HashSet h3=new HashSet(h2);
        h3.add("Cyber");    h3.add("Success");
        System.out.println(h3);
    }
}
//public java.util.HashSet();
