package collection.mapclasses;

import java.util.Set;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3 {
        public static void main(String[] args) {
            TreeMap<MakeMyTrip,String> tm1=new TreeMap<MakeMyTrip,String>(new CompCustDestLoc());
            tm1.put(new MakeMyTrip(222,"Singhapur"),"Pune");
            tm1.put(new MakeMyTrip(111,"Dubai"),"Mumbai");
            tm1.put(new MakeMyTrip(333,"Switzerland"),"Delhi");
            Set<MakeMyTrip> m=tm1.keySet();
            for(MakeMyTrip mm:m)
            {
                System.out.println(mm.travelId + " - " + mm.travelDestination);
            }
        }
    }

