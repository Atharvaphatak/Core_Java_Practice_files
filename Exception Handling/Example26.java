class Example26
{	public static void main(String args[])
	{	System.out.println("Start");
		try
		{	System.out.println("Inside try block");
			System.exit(0);	///normal shutdown
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
*/
