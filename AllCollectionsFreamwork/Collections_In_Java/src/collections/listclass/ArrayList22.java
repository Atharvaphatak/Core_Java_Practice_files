package collections.listclass;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList22 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add('B');    al.add('A');
        al.add('D');    al.add('C');
        System.out.println(al);
        Collections.sort(al);   //-->compareTo to String
        System.out.println(al);
    }
}
