package collections.listclass;

import java.util.ArrayList;

public class ArrayList9 {
    public static void main(String[] args) {
        ArrayList all=new ArrayList();
        all.add(100); all.add(200); all.add(300);
        System.out.println(all);
        System.out.println(all.size());
        ArrayList all1=new ArrayList();
        all1.add("X"); all1.add("Y"); all1.add("Z");
        System.out.println(all1);
        all.addAll(all1);//one collection to another collection
        System.out.println(all1.size());
    }
}
