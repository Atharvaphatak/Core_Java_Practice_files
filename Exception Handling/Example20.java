class Example20
{	public static void main(String args[])
	{	System.out.println("Start");
		try
		{	System.out.println("Inside try block");
		}
		catch (ArithmeticException e)
		{	System.out.println("Inside catch block");	
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
	Stop
*/
