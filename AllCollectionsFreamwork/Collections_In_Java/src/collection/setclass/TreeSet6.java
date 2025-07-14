package collection.setclass;
import java.util.SortedSet;
import java.util.TreeSet;
public class TreeSet6
{
    public static void main(String[] args) {
        TreeSet ts1=new TreeSet();
        ts1.add(20); ts1.add(10); ts1.add(40);
        ts1.add(30); ts1.add(50);
        System.out.println(ts1);
        SortedSet ss1 =ts1.headSet(30);
        SortedSet ss2=ts1.tailSet(30);
        System.out.println("HeadSet "+ss1);
        System.out.println("TailSet "+ss2);
    }
}
//public java. headSet(E);
//public java. taitSet(E);