package collection.setclass;
import java.util.Comparator;
public class CompFlipkartName implements Comparator<Flipkart> {
    public int compare(Flipkart f1, Flipkart f2)
    {
        int status=f1.proName.compareTo(f2.proName);
        return status;
    }
}
