class Example19
{	public static void main(String args[])
	{	System.out.println("Start");
		int[] a={10,20,30};
		try
		{	System.out.println("Inside try block");
			System.out.println(10/0);	
			System.out.println(a[5]);
		}
		catch (Exception e)
		{	System.out.println("Inside catch Exception");	
			System.out.println(a[1]);
		}
		catch (ArithmeticException ae)
		{	System.out.println("Inside catch ArithmeticException");	
			System.out.println(10/2);
		}
		System.out.println("Stop");
	}
}
/*
	Example19.java:14: error: exception ArithmeticException has already been caught
					catch (ArithmeticException ae)
					^
	1 error
*/
