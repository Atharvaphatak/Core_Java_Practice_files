class Hdfc
{	int amountBal;
	Hdfc(int amountBal)
	{
		if(amountBal>0)
		{
			this.amountBal=amountBal;
		}
		else
		{
			System.out.println("Insideelse Block");
			//System.out.println(10/0);// new ArithmeticException()--> / by zero
			throw new ArithmeticException("Please enter valid amount");
		}
	}
}
class Example32
{
	public static void main(String args[])
	{	System.out.println("Start");
		Hdfc cust1=new Hdfc(0);
		System.out.println("Stop");
	}
}
/*
Start
Insideelse Block
Exception in thread "main" java.lang.ArithmeticException: Please enter valid amount
        at Hdfc.<init>(Example32.java:13)
        at Example32.main(Example32.java:21)
*/