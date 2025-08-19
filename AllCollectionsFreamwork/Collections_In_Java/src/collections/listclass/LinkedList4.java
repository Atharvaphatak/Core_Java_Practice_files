package collections.listclass;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList<Employee> ll1=new LinkedList<Employee>();
        ll1.add(new Employee(101,"Lenevo"));
        ll1.add(new Employee(202,"Acer"));
        ll1.add(new Employee(303,"Hp"));
        Iterator<Employee> i=ll1.iterator();
        while(i.hasNext())
        {
            Employee e=i.next();
            System.out.println(e.empId+" - "+ e.empName);
        }
    }
}
