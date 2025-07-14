package collection.setclass;

import java.util.TreeSet;
public class TreeSet5
{ public static void main(String[] args) {
    TreeSet ts1=new TreeSet();
    ts1.add("B"); ts1.add("A"); ts1.add("C");
    System.out.println(ts1);
    TreeSet ts2=new TreeSet(ts1);
    ts2.add("Q"); ts2.add("R"); ts2.add("P");
    System.out.println(ts2);
    TreeSet ts3=new TreeSet();
    ts3.addAll(ts2);
    ts3.add("X"); ts3.add("Z"); ts3.add("Y");
    System.out.println(ts3);
}
}