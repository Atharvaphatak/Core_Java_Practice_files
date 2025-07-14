/*if an exception is raised within try block then the controller will go to the catch block 
but controller will never return back to the try block */
class Example10
{	public static void main(String args[])
	{	System.out.println("start");
		int a[]={10,20,30,40,50};
		try
		{
			System.out.println("Inside try Block..");
			System.out.println(10/0);
			System.out.println(a[10]);	
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside catch Block ArithmeticException");
		}
		System.out.println("stop");
	}
} 
/*
	start
	Inside try Block..
	Inside catch Block ArithmeticException
	stop
*/