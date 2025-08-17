package collections.listclass;

import java.util.ArrayList;

public class ArrayList12 {
    public static void main(String[] args) {
        // Generic Collection
        ArrayList<Emp1> al1=new ArrayList<Emp1>();
        al1.add(new Emp1(101,"Cyber"));
        //1 Approach --> Extract--> for
        for (Emp1 e:al1)
        {
            System.out.println(e.empId+" - "+e.empName);
        }
        // 2 Approach
        Emp1 ee=al1.get(0);
        System.out.println(ee.empId+" - "+ee.empName);
    }
}
