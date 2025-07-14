/*A try block can generate different type of exceptions but any point of time 
it can generate only one exception */
/*We can have minimum one try block but 
we can have minimum one catch block or multiple catch blocks */
class Example11
{	public static void main(String args[])
	{	System.out.println("start");
		int a[]={10,20,30,40,50};
		try
		{
			System.out.println("Inside try Block..");
			System.out.println(10/2);	//5
			System.out.println(a[11]);	
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside catch Block ArithmeticException");
		}
		catch (ArrayIndexOutOfBoundsException aib)
		{
			System.out.println("Inside catch Block ArrayIndexOutOfBoundsException");
		}
		System.out.println("stop");
	}
} 
/*
	start
	Inside try Block..
	5
	Inside catch Block ArrayIndexOutOfBoundsException
	stop
*/