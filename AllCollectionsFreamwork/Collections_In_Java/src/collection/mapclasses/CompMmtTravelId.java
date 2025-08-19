package collection.mapclasses;

import java.util.Comparator;

public class CompMmtTravelId implements Comparator<MakeMyTrip>{
    int status;

    public int compare(MakeMyTrip mm1, MakeMyTrip mm2) {
        if (mm1.travelId == mm2.travelId) {
            status = 0;
        }
        else if (mm1.travelId > mm2.travelId) {
            status = -1;
        }
        else if (mm1.travelId < mm2.travelId) {
            status = 1;
        }
        return status;
    }
}
