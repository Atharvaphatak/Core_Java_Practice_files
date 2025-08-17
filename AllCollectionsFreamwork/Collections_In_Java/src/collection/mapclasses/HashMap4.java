package collection.mapclasses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap4 {
    public static void main(String[] args) {
        HashMap<Stud,Emp> hm1=new HashMap<Stud,Emp>();
        hm1.put(new Stud(101, "Rahul"),new Emp(1111,"Kavita"));
        hm1.put(new Stud(101, "Hitesh"),new Emp(2222,"Priya"));
        hm1.put(new Stud(101, "Sanjay"),new Emp(3333,"Neelam"));
        Set s=hm1.entrySet();
        Iterator i=s.iterator();
        while(i.hasNext())
        {
            Map.Entry<Stud,Emp> me=(Map.Entry)i.next();
            Stud ss=me.getKey();
            Emp ee=me.getValue();
            System.out.print(ss.studId+" - "+ss.studName+" *** ");
            System.out.println(ee.empId+" - "+ee.empName);
        }
    }
}
