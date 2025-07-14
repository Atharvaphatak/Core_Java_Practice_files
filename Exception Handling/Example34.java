class Flipkart
{	void deliveryStatus(boolean status)
	{	if(status==true)
		{	System.out.println("Delivery is Possible");
		}
		else
		{
			try
			{	throw new NotDeliverable("Product not NotDeliverable in your area");
			}
			catch (NotDeliverable nd)
			{	System.out.println("Do you want to notified when the delivery starts");
			}
		}
	}
}
class Example34
{	public static void main(String args[])
	{	System.out.println("Start");
		Flipkart cust2=new Flipkart();
		cust2.deliveryStatus(false);
		System.out.println("Stop");
	}
}
/*
Example34.java:9: error: cannot find symbol
                        {       throw new NotDeliverable("Product not NotDeliverable in your area");
                                          ^
  symbol:   class NotDeliverable
  location: class Flipkart
Example34.java:11: error: cannot find symbol
                        catch (NotDeliverable nd)
                               ^
  symbol:   class NotDeliverable
  location: class Flipkart
2 errors
*/