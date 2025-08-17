package collections.listclass;

import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Emp1> at = new ArrayList<Emp1>();
        at.add(new Emp1(101, "Rahul"));
        at.add(new Emp1(202, "Kirti"));
        at.add(new Emp1(303, "Tushar"));
        for (Emp1 e : at) {
            System.out.println(e.empId + " - " + e.empName);
        }
    }
}
