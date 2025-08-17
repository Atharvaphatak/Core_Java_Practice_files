package collection.mapclasses;
import java.util.HashMap;

public class HashMap5 {
    public static void main(String[] args) {
        HashMap hm1=new HashMap();
        hm1.put(101,'x'); hm1.put(202,'y');
        System.out.println(hm1);

        // add data using putAll() Method --> one collection to another collection
        HashMap hm2=new HashMap();
        hm2.putAll(hm1);
        hm2.put(303,'a'); hm2.put(404,'b');
        System.out.println(hm2);

        //add data using constructor Based Approach --> one collection to another collection
        HashMap hm3=new HashMap(hm2);
        hm3.put(505,'p'); hm3.put(606,'q');
        System.out.println(hm3);

    }
}
