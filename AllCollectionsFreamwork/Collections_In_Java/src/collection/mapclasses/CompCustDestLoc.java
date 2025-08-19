package collection.mapclasses;

import java.util.Comparator;

public class CompCustDestLoc implements Comparator<MakeMyTrip>
{   int status;
    public int compare(MakeMyTrip o1, MakeMyTrip o2) {
        status=o1.travelDestination.compareTo(o2.travelDestination);
        return status;
    }
}
