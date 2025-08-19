package collections.listclass;
//example on comparator -->
public class Swiggy implements Comparable{
    int orderId;
    String orderName;
    int status;
    Swiggy(int orderId, String orderName)
    {
        this.orderId=orderId;
        this.orderName=orderName;
    }
    //Order Id
    public int compareTo(Object o)
    {
        Swiggy s=(Swiggy)o;
        if(s.orderId==orderId)
        {
            status=0;
        }
        else if(s.orderId>orderId)
        {
            status =-1;
        }
        else if(s.orderId<orderId)
        {
            status =1;
        }
        return status;
    }
}
