package collections.listclass;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList();
        ll1.add(100);   ll1.add(200);
        System.out.println(ll1);
        //1 Approach
        LinkedList ll2=new LinkedList(ll1);
        ll2.add('x');   ll2.add('y');
        System.out.println(ll2);

        //2 Approach
        LinkedList ll3=new LinkedList();
        ll3.addAll(ll2);
        ll3.add(true);  ll3.add(false);
        System.out.println(ll3);

    }
}
