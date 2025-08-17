package collections.listclass;
import java.util.ArrayList;
public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(100); al.add(200);  al.add(300);
        System.out.println(al);

        al.add(1,150);
        System.out.println(al);

        al.remove(2);//index
        System.out.println(al);

        Integer i =300;
        al.remove(i);//object
        System.out.println(al);
    }
}
