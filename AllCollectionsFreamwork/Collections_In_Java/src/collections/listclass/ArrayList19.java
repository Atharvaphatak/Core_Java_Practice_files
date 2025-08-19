package collections.listclass;

import java.util.Arrays;
import java.util.List;

public class ArrayList19 {
    public static void main(String[] args) {
        //Array to collection
        String[] comp={"Lenovo","Acer","Dell"};
        List<String> l= Arrays.asList(comp);
        System.out.println(l);
        for(String ss:l)
        {
            System.out.println(ss);
        }

    }
}
