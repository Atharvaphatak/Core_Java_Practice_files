package collections.listclass;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add('x');   al.add('y');   al.add('z');
        ListIterator li=al.listIterator();
        while (li.hasNext())
        {
            Character cc=(Character) li.next();
            System.out.println(cc);
        }

    }
}
