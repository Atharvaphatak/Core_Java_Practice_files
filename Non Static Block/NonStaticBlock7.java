class Hdfc
{	int AmountBal;
	{
		System.out.println("logics to verify Addhar details..");
	}
	Hdfc(int AmountBal)
	{
		if(AmountBal>=10000)
		{	this.AmountBal=AmountBal;
			System.out.println("Bank Account Successfully Created..");
		}
		else
		{	System.out.println("Unbale to Open Bank Account..");
		}
		int getBalanceInfo()
		{	System.out.println("Please wait....................retriving your Balance..");
			return AmountBal; 
		}
	}
}
class NonStaticBlock7
{	public static void main(String args[])
	{	System.out.println("Start");
		Hdfc cust1=new Hdfc();
		int currentBal=cust1.getBalanceInfo();
		System.out.println("Current Balance is "+currentBal);
		System.out.println("Stop");
	}
}
/*

*/
	

