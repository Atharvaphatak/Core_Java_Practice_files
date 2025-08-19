package collections.listclass;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayList18 {
    public static void main(String[] args) {
        //Collection to String
        ArrayList<String> al=new ArrayList<String>();
        al.add("Monday");
        al.add("Tuesday");
        al.add("Wednesday");
        //al.toArray(T[])--> t-type--> new T[Size];
        String[] ss=al.toArray(new String[al.size()]);
        for (String sss:ss)
        {
            System.out.println(sss);
        }
    }
}
