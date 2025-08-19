package collections.listclass;

import java.util.Comparator;

public class CompMenuId implements Comparator {
    int status;
    public int compare(Object o1, Object o2)
    {   Zomato z1=(Zomato)o1;
        Zomato z2=(Zomato)o2;
        if(z1.menuId==z2.menuId)
        {
            status=0;
        }
        else if(z1.menuId>z2.menuId)
        {
            status=1;
        }
        else if(z1.menuId<z2.menuId)
        {
            status=-1;
        }
        return status;
    }
}
