package collections.listclass;

import java.util.LinkedList;

public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList();
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        System.out.println(ll1);
        ll1.addFirst('a');
        ll1.addLast('z');
        System.out.println(ll1);
    }
}
