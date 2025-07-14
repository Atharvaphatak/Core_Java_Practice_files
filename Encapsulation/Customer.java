class Hdfc
{	private int amountbal;
	Hdfc(int amountbal)
	{
		if(amountbal>10000)
		{
			this.amountbal=amountbal;
			System.out.println("Your account is successfully created, Balance is:"+this.amountbal);
		}
		else
		{
			System.out.println("Please Deposit valid amount");
		}
	}
		void setbalance(int amount)
		{	amountbal=amountbal+amount;
			System.out.println("Your accountbal of "+ amount +" is successfully added");
		}
		public int getbalance()
		{
			System.out.println("Processing your transaction,kindly wait......");
			return amountbal;
		}
	}
class Customer
{	public static void main(String args[])
	{
		Hdfc cust1=new Hdfc(1000);
		cust1.setbalance(50000);
		int currentbal=cust1.getbalance();
		System.out.println("Current Balance is:"+currentbal);
	}
}
/*
	Please Deposit valid amount
	Your accountbal of 50000 is successfully added
	Processing your transaction,kindly wait......
	Current Balance is:50000
*/