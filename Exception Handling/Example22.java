class Example22
{	public static void main(String args[])
	{	System.out.println("Start");
		try
		{	System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch (NullPointerException np)
		{	System.out.println("Inside catch block NullPointerException");	
		}
		finally
		{	System.out.println("Inside Finally block");
		}
		System.out.println("Stop");
	}
}
/*
	Start
	Inside try block
	Inside Finally block
	Exception in thread "main" java.lang.ArithmeticException: / by zero
			at Example22.main(Example22.java:6)
*/
