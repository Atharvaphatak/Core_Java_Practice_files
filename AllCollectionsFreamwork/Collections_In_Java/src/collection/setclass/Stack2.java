package collection.setclass;

import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
       Stack st1=new Stack();
       st1.add(100);    st1.add(200);   st1.add(300);
       st1.push(400); st1.push(500); st1.push(600);
        System.out.println(st1);    //3
        System.out.println(st1.peek());//return the copy of the top most object element
        System.out.println("-----------------------------------");
        System.out.println(st1);
        System.out.println(st1.pop());//return the top most object and delete it
        System.out.println("-----------------------------------");
        System.out.println(st1);
        System.out.println(st1.empty());//it return the given stack is empty or not
        System.out.println("--------------------------------");
        System.out.println(st1);
        System.out.println(st1.search(800));   //it returns the (if true)=1 or (if false)=-1
        System.out.println("---------------------------------");
    }
}
/*
public E push(E);
public synchronized E pop();
public synchronized E peek();
public boolean empty();
public synchronized int search(java.lang.Object);
*/
