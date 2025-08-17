package collections.listclass;
import java. util.ArrayList;
public class ArrayList6 {
    public static void main(String args[]) {
        ArrayList al = new ArrayList();
        System.out.println(al);//toString -> called Collections --> []
        al.add(10);//toString--> Integer
        al.add('x');//toString--> Character
        al.add("Cyber");//toString--> String
        al.add(new Emp1(101, "A"));//toString Emp1
        System.out.println(al);
    }
}
