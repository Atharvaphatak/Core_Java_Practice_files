package collection.setclass;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet hs1=new HashSet();
        hs1.add(30);   hs1.add(20);   hs1.add(10);
        System.out.println(hs1);
        hs1.add(20);   hs1.add(10);// we cam pass duplicate value here but compiler can't throw error it will give as same obj
        System.out.println(hs1);
        hs1.add(null);
        System.out.println(hs1);
        hs1.add('x'); hs1.add(true);
        System.out.println(hs1);

    }
}
