class RedBus
{	void bookTicket(String destination)
	{
		if(destination.equals("Shrinagar"))
		{
			System.out.println("Bus is Avaliable..");
		}
		else
		{
			throw new BusUnavaliable();
		}
	}
}
class Example35
{
	public static void main(String args[]) throws NotDeliverable
	{
		System.out.println("Start");
		RedBus cust1=new RedBus();
		cust1.bookTicket("Lakhanpur");
		System.out.println("Stop");
	}
}