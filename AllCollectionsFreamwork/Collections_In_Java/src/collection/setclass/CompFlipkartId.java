package collection.setclass;

import java.util.Comparator;

public class CompFlipkartId implements Comparator<Flipkart> {
    int status;
    public int compare(Flipkart f1, Flipkart f2)
    {
        if(f1.proId==f2.proId)
        {
            status=0;
        } else if(f1.proId>f2.proId)
        {
            status=1;
        }
        else if(f1.proId>f2.proId)
        {
            status=-1;
        }
        return status;
    }

}
