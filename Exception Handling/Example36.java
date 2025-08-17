class MakeMyTrip
{
	void bookFlight(String source)
	{
		if(source.equals("Andaman"))
		{
			System.out.println("Flight Are Avaliable");
		}
		else 
		{
			throw new FlightUnavalible("Flight is not Avaliable, try nearest port");
		}
	}
}
class Example36
{	public static void main(String args[])
	{
		System.out.println("Start");
		MakeMyTrip cust1=new MakeMyTrip();
		cust1.bookFlight("lakshyadeep");
		System.out.println("Stop");
	}
}
/* output
Start
Exception in thread "main" FlightUnavalible: Flight is not Avaliable, try nearest port
        at MakeMyTrip.bookFlight(Example36.java:11)
        at Example36.main(Example36.java:20)
*/
