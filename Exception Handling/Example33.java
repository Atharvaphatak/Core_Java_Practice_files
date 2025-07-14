class Flipkart
{
	void checkPhones(int prodId)
	{
		if (prodId>=101)
		{	System.out.println("All products are Avaliable");
		}
		else
		{	System.out.println("Currently Unavaliable");
			throw new CurrentlyUnavaliable();
		}
	}
}
class Example33
{	public static void main(String args[])
	{	System.out.println("Start");
		Flipkart cust1=new Flipkart();
		cust1.checkPhones(100);
		System.out.println("Stop");
	}
}
/*
Example34.java:11: error: unreported exception CurrentlyUnavaliable; must be caught or declared to be thrown
                        throw new CurrentlyUnavaliable();
                        ^
1 error
*/