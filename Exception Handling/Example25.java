class Example25
{	public static void main(String args[])
	{	System.out.println("Start");
		try
		{	System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{	System.out.println("Inside catch block");
		}
		finally
		{	System.out.println("Inside Finally block");
			try
			{	System.out.println("Inside try block");
				System.out.println(10/0);
			}
			catch(ArithmeticException ae)
			{	System.out.println("Inside catch block");
			}
		}
		System.out.println("Stop");
	}
}
/*
	Start
	Inside try block
	Inside catch block
	Inside Finally block
	Inside try block
	Inside catch block
	Stop
*/
