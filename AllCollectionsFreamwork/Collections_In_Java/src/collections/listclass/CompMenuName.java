package collections.listclass;

import java.util.Comparator;

public class CompMenuName implements Comparator<Zomato> {

    @Override
    public int compare(Zomato z1, Zomato z2) {
        //int status=z1.menuName,comapreTo(z2.menuName)
        //return status;
        return z1.menuName.compareTo(z2.menuName);
    }
    /*
    public int compare(Zomato o1, Zomato 02) {
    Zomato z1=(Zomato)o1;
    Zomato z2=(Zomato)o2;
    return 0;
    */
}
