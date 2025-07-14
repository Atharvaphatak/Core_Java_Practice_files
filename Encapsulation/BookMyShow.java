class PvrMovies
{	private static PvrMovies mticket;
	private static boolean ticketstatus=false;
	private PvrMovies()
	{
		System.out.println("Welcome to PvrMovies..Best in Entertainment..");
	}
	public static PvrMovies bookTicket()
	{
		if(ticketstatus==false)
		{
			mticket=new PvrMovies();
			ticketstatus=true;
		}
		return mticket;
	}
}
class BookMyShow
{	public static void main(String args[])
	{
		PvrMovies cust1= PvrMovies.bookTicket();
		System.out.println("Customer Ticket is: "+ cust1);
		cust1=PvrMovies.bookTicket();
		System.out.println("Customer Ticket is: "+ cust1);
		cust1=PvrMovies.bookTicket();
		System.out.println("Customer Ticket is: "+ cust1);
	}	
}
/*
	Welcome to PvrMovies..Best in Entertainment..
	Customer Ticket is: PvrMovies@28a418fc
	Customer Ticket is: PvrMovies@28a418fc
	Customer Ticket is: PvrMovies@28a418fc
*/