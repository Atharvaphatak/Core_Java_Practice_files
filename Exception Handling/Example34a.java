class Flipkart
{	void deliveryStatus(boolean status) throws NotDeliverable
	{	if(status==true)
		{	System.out.println("Delivery is Possible");
		}
		else
		{	throw new NotDeliverable("Product not NotDeliverable in your area");	
		}
	}
}
class Example34a
{	public static void main(String args[]) throws NotDeliverable
	{	System.out.println("Start");
		Flipkart cust2=new Flipkart();
		cust2.deliveryStatus(false);
		System.out.println("Stop");
	}
}
/*
Example34a.java:2: error: cannot find symbol
{       void deliveryStatus(boolean status) throws NotDeliverable
                                                   ^
  symbol:   class NotDeliverable
  location: class Flipkart
Example34a.java:12: error: cannot find symbol
{       public static void main(String args[]) throws NotDeliverable
                                                      ^
  symbol:   class NotDeliverable
  location: class Example34a
Example34a.java:7: error: cannot find symbol
                {       throw new NotDeliverable("Product not NotDeliverable in your area");
                                  ^
  symbol:   class NotDeliverable
  location: class Flipkart
3 errors

*/