package collections.listclass;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList15 {
    public static void main(String[] args) {
        ArrayList<Emp1> al1=new ArrayList<Emp1>();
        al1.add(new Emp1(101,"Cyber"));
        al1.add(new Emp1(202,"Success"));
        al1.add(new Emp1(303,"Tech"));
        al1.add(new Emp1(404,"Training"));
        Iterator<Emp1> i=al1.iterator();
        //Search Tech -> Remove Tech
        while (i.hasNext())
        {   Emp1 e=i.next();
            if (e.empName.equals("Tech"))
            {
                i.remove();
            }
        }
        //Extract and display the data within ArrayList
        for(Emp1 ee:al1)
        {
            System.out.println(ee.empId+" - "+ee.empName);

        }

    }
}
