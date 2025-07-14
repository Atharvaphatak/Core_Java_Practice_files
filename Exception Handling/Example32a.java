class Hdfc
{	int amountBal;
	Hdfc(int amountBal)
	{
		if(amountBal>5000)
		{	this.amountBal=amountBal;
		}
		else
		{	System.out.println("Insideelse Block");
			//System.out.println(10/0);// new ArithmeticException()--> / by zero
			throw new ArithmeticException("Please enter valid amount");
		}
	}
}
class Example32a
{	public static void main(String args[])
	{	System.out.println("Start");
		Hdfc cust1=new Hdfc(100);
		System.out.println("Stop");
	}
}
// public java.lang.ArithmeticException(String)
/*
Start
Insideelse Block
Exception in thread "main" java.lang.ArithmeticException: Please enter valid amount
        at Hdfc.<init>(Example32a.java:13)
        at Example32a.main(Example32a.java:21)
*/