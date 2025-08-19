package collection.setclass;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack st1=new Stack();
        st1.push(10);   st1.push(20);   st1.push(30);
        System.out.println(st1);
        st1.push("A");   st1.push("B");   st1.push("C");
        System.out.println(st1);
        st1.push(200);   st1.push(null);   st1.push('Z');
        System.out.println(st1);
    }
}
//public E push(E);