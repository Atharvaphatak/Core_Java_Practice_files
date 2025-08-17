package collections.listclass;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList17 {
    public static void main(String[] args) {
        ArrayList<Emp1>al1=new ArrayList<Emp1>();
        al1.add(new Emp1(101,"Cyber"));
        al1.add(new Emp1(202,"Tech"));
        al1.add(new Emp1(303,"Success"));
        al1.add(new Emp1(404,"Training"));
        ListIterator<Emp1> li= al1.listIterator();
        while(li.hasNext())
        {   Emp1 e=li.next();
            if(e.empName.equals("Tech"))
            {
                li.remove();
            }
            if(e.empName.equals("Training"))
            {
                li.set(new Emp1(404,"Training in Pune"));
            }
            System.out.println(e.empId+" - "+e.empName);
        }
    }
}

//7 july
