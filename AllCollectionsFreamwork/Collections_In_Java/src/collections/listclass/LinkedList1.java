package collections.listclass;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList li1=new LinkedList();
        li1.add(100);   li1.add(200);
        System.out.println(li1);
        li1.add('x');   li1.add(true);
        System.out.println(li1);
        li1.add('z');   li1.add(false);
        System.out.println(li1);
        li1.add(null);
        System.out.println(li1);
    }
}
