class Example27
{	public static void main(String args[])
	{	System.out.println("Start");
		System.out.println(10/0);
		try
		{	System.out.println("Inside Try block");
		}
		catch(ArithmeticException ae)
		{	System.out.println("Inside Catch block");
		}
		finally
		{	System.out.println("Inside Finally block");
		}
		System.out.println("Stop");
	}
}
/*
	Start
	Exception in thread "main" java.lang.ArithmeticException: / by zero
			at Example27.main(Example27.java:4)
*/
