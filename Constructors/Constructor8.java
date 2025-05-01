class Hdfc
{	int AmountBal;
	Hdfc(int AmountBal)
	{
		if(AmountBal>=10000)
		{	this.AmountBal=AmountBal;
			System.out.println("Bank Account Successfully Created..");
		}
		else
		{	System.out.println("Unbale to Open Bank Account..");
		}
	}
}
class Constructor8
{	public static void main(String args[])
	{	System.out.println("Start");
		Hdfc bank=new Hdfc(15000);
		System.out.println("Stop");
	}
}
/*
Start
Bank Account Successfully Created..
Stop
*/
	

