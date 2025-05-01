class Flipkart
{
	void payment()
	{	System.out.println("Logics to accept Cash on Delivery");
	}
	void payment(int debitcredit)
	{	System.out.println("Logics to accept debit/credit Card Delivery");	
	}
	void payment(String UPI)
	{	System.out.println("Logics to accept UPI Delivery");	
	}
	void payment(float EMI)
	{	System.out.println("Logics to accept EMI Delivery");	
	}
}
class Example4
{	public static void main(String args[])
	{	System.out.println("Start");
		Flipkart cust=new Flipkart();
		cust.payment(1234);
		System.out.println("Stop");
	}
}
/*
Start
Logics to accept debit/credit Card Delivery
Stop
*/	