class Example15
{	public static void main(String args[])
	{	System.out.println("start");
		try
		{	System.out.println("Inside Try Block..");
			System.out.println(10/0);	//new ArithmeticException()
		}
		catch(Exception e)
		{	System.out.println("Inside Exception Catch block");
			//tostring()
			System.out.println(e.toString());		
			System.out.println("=====================");
			//getMessage
			System.out.println(e.getMessage());	
			System.out.println("=====================");
			//printStackTrace()
			e.printStackTrace();
		}
		System.out.println("stop");
	}
} 
//	public String toString();
//	public String getMessage();
//	public void printStackTrace();

/*
	start
	Inside Try Block..
	Inside Exception Catch block
	java.lang.ArithmeticException: / by zero
	=====================
	/ by zero
	=====================
	java.lang.ArithmeticException: / by zero
			at Example15.main(Example15.java:6)
	stop
*/	