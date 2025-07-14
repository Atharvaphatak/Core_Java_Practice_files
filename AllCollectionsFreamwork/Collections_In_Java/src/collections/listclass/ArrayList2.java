package collections.listclass;
import java.sql.Array;
import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String[] args)
    {
        ArrayList a2=new ArrayList();
        a2.add("Cyber");
        a2.add("Success");
        a2.add("Training");
        System.out.println(a2);
        for(Object o:a2)
        { String ss=(String)o;
            System.out.println(ss);
        }

    }
}
