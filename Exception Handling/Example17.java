class Example17
{	public static void main(String args[])
	{	System.out.println("Start");
		int[] a={10,20,30};
		try
		{	System.out.println("inside outer try block");
			try
			{	System.out.println("inside outer try-Inner try block");
				System.out.println(10/0);
				
			}
			catch (ArithmeticException ae )
			{	System.out.println("inside outer try-Inner catch block");
			}
			System.out.println(a[5]);
		}
		catch (ArrayIndexOutOfBoundsException ai)
		{	System.out.println("Inside outer catch block");
			try
			{	System.out.println("--> Inside outer catch-inner try block");
			System.out.println(10/0);
			}
			catch (ArithmeticException ae)
			{	System.out.println("--> Inside outer catch-inner catch block");
			}
		}
		System.out.println("Stop");
	}
}
/*
	Start
	inside outer try block
	inside outer try-Inner try block
	inside outer try-Inner catch block
	Inside outer catch block
	--> Inside outer catch-inner try block
	--> Inside outer catch-inner catch block
	Stop
*/
