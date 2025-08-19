package collections.listclass;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList20 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(150); al.add(50);
        al.add(100); al.add(75);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
