package collections.listclass;

import java.util.Vector;

public class Vector4 {
        public static void main(String[] args) {
            Vector v1=new Vector(5,3);
            v1.add(10);   v1.add(20);  v1.add(30);
            System.out.println(v1.size());              //3
            System.out.println(v1.capacity());         //5
            System.out.println("--------------------");
            v1.add(10);   v1.add(20); v1.add(30);
            System.out.println(v1.size());          //6
            System.out.println(v1.capacity());      //5+3=8
            System.out.println("--------------------------");
            v1.add(10);   v1.add(20);  v1.add(30);
            System.out.println(v1.size());          //9
            System.out.println(v1.capacity());      //8+3=11


        }
    }


