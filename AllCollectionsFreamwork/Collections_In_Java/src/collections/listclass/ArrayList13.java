package collections.listclass;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList13 {
    public static void main(String[] args) {
        ArrayList<Emp1> al1=new ArrayList<Emp1>();
        al1.add(new Emp1(101,"Cyber"));
        al1.add(new Emp1(202,"Success"));
        al1.add(new Emp1(303,"Training"));
        Iterator i=al1.iterator();
        while (i.hasNext())
        {
            Emp1 e=(Emp1)i.next();
            System.out.println(e.empId+" - "+e.empName);

        }

    }
}
