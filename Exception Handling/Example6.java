//If exception is raised of a particular type it will be handled by the same type of an exception,
//if we handle different type of exception it will lead to abnormal termination. 
class Example6
{	public static void main(String args[])
	{	
		System.out.println("start");
		try
		{
			System.out.println("Inside try Block..");	// new ArithmeticException()
			System.out.println(10/0);		
		}
		catch (NullPointerException npe)
		{
			System.out.println("Inside catch Block..");
			System.out.println(10/2);
		}
		System.out.println("stop");
	}
} //ArithmeticException ae=new ArithmeticException();
/* 
	start
	Inside try Block..
	Exception in thread "main" java.lang.ArithmeticException: / by zero
			at Example6.main(Example6.java:8)
*/
//abnormal termination