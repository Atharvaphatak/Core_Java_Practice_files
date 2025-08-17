package collections.listclass;
import java.util.ArrayList;

public class ArrayList10 {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(100); al1.add(200); al1.add(300);
        System.out.println(al1);
        ArrayList al2=new ArrayList();
        al2.add("X"); al2.add("Y"); al2.add("Z");
        al2.addAll(al1);// add al1 inside al2
        System.out.println(al2);
        al2.removeAll(al1);// remove al1 from al2
        System.out.println(al2);
        al2.retainAll(al1); // retain al1 data/ remove al2 data
        System.out.println(al2);
        System.out.println(al2.isEmpty());
    }
}
