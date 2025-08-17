package collections.listclass;

import java.util.ArrayList;

public class ArrayList11 {
    public static void main(String[] args) {
        //Normal Collection
        ArrayList al1=new ArrayList();
        al1.add(new Emp1(101,"Cyber"));

        //1 Approach--> Extract --> For Each
        for (Object o :al1) {
            Emp1 e = (Emp1) o;
            System.out.println(e.empId + " - " + e.empName);
        }
        // 2 Approach--> get()
        //Object 00=al1.get(o);
        //Emp1 ee=(Emp1)oo;
        Emp1 ee=(Emp1)al1.get(0);
        System.out.println(ee.empId + " - " + ee.empName);
    }
}
