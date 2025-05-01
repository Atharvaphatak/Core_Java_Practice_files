class Rbi
{	void loan()
	{	System.out.println("Rbi - ROI 7%");
	}
	final void activation()
	{	System.out.println("Rbi activation Charges are: 1%");
	}
}
class Icici extends Rbi
{	void loan()
	{	System.out.println("Icici - ROI 16%");
	}
	/*void activation()
	{	System.out.println("Rbi activation Charges are: 5%");
	}*/
}
class Hdfc extends Rbi
{	void loan()
	{	System.out.println("Hdfc - ROI 7%");
	}
}
class Yes extends Rbi
{	void loan()
	{	System.out.println("Yes - ROI 7%");
	}
}
class Example25
{	public static void main(String args[])
	{	System.out.println("Start");
		
		Rbi cust1=new Icici();
		cust1.activation();
		cust1.loan();
		
		Rbi cust2=new Yes();
		cust1.activation();
		cust1.loan();
		
		System.out.println("Stop");
	}
}