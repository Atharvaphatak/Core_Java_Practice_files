package collections.listclass;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList23 {
    public static void main(String[] args) {
        ArrayList<Swiggy> al=new ArrayList<Swiggy>();
        al.add(new Swiggy(202,"Sandesh"));
        al.add(new Swiggy(101,"Biryani"));
        al.add(new Swiggy(303,"Pizza"));
        for (Swiggy s:al)
        {
            System.out.println(s.orderId+" - "+s.orderName);
        }
        Collections.sort(al);
        for (Swiggy s:al)       //compareTo
        {
            System.out.println(s.orderId+" - "+s.orderName);
        }
    }
}
