class Example24
{	public static void main(String args[])
	{	System.out.println("Start");
		try
		{	System.out.println("Inside try block");
			System.out.println(10/0);
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
