package collections.listclass;

import java.util.Vector;

public class Vector3 {
    public static void main(String[] args) {
        Vector v1=new Vector(5);
        v1.add(10);   v1.add(20);  v1.add(30);
        System.out.println(v1.size());              //3
        System.out.println(v1.capacity());         //5
        System.out.println("--------------------");
        v1.add(10);   v1.add(20); v1.add(30);
        System.out.println(v1.size());          //6
        System.out.println(v1.capacity());      //10
        System.out.println("--------------------------");
        v1.add(10);   v1.add(20);  v1.add(30);
        v1.add(40);   v1.add(50);  v1.add(60);
        System.out.println(v1.size());          //12
        System.out.println(v1.capacity());      //20


    }
}
