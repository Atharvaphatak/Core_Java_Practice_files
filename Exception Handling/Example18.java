class Example18
{	public static void main(String args[])
	{	System.out.println("Start");
		int[] a={10,20,30};
		try
		{	System.out.println("Inside try block");
			System.out.println(10/2);	//5
			System.out.println(a[5]);
		}
		catch (ArithmeticException ae)
		{	System.out.println("Inside catch ArithmeticException");	
		}
		catch (Exception e)
		{	System.out.println("Inside catch Exception");	
		}
		System.out.println("Stop");
	}
}
/*
	Start
	Inside try block
	5
	Inside catch Exception
	Stop	
*/
