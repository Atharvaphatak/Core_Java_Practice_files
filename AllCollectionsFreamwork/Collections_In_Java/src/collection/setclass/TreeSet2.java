package collection.setclass;
import java.util.TreeSet;
public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet ts2=new TreeSet();
        ts2.add(10);
        ts2.add(10);
        // ts2.add('x');    runtime error
        //ts2.add("Atharva");   runtime error
       // ts2.add(null); NullPointerException
        System.out.println(ts2);

    }
}
