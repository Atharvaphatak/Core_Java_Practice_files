package collection.setclass;
//import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;
    public class TreeSet7
    { public static void main(String[] args) {
        TreeSet ts1=new TreeSet();
        ts1.add(20); ts1.add(10);
        ts1.add(40);
        ts1.add(30); ts1.add(50);
        System.out.println(ts1);
        SortedSet ss1 =ts1.headSet(30);
        SortedSet ss2 =ts1.tailSet ( 30);
        TreeSet ts2=new TreeSet(ss1); System.out.println(ts2);
        TreeSet ts3=new TreeSet(ss2); System.out.println(ts3);
    }
    }
// public java.util.SortedSet<E> headSet (E);
// public java.util.SortedSet<E> tailSet(E);
//public java.util.TreeSet(java.util.SortedSet <E>);

