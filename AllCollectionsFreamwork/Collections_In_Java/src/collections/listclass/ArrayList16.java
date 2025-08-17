package collections.listclass;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList16 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Cyber"); al.add("Success");
        al.add("Training"); al.add("Pune");
        ListIterator<String> li=al.listIterator();
        System.out.println("Before Forward");
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
        System.out.println("After Forward");
        System.out.println("Before Reverse");
        while(li.hasPrevious())
        {
            System.out.println(li.previous());
        }
        System.out.println("After Reverse");

    }
}
