/* Whenever we print any exception reference variable it doesn't print the address 
but it will print the exception type  */
class Example14
{	public static void main(String args[])
	{	System.out.println("start");
		int a[]={10,20,30};
		try
		{
			System.out.println("Inside try Block..");
			System.out.println(10/2);	//new ArithmeticException()
			System.out.println(a[5]);	//new ArrayIndexedOutOfBoundsException()	
		}
		catch(Exception e)
		{
			System.out.println("Inside Exception Catch block");
			System.out.println(e);		//shows the exception type
		}
		System.out.println("stop");
	}
} 
/*
	start
	Inside try Block..
	5
	Inside Exception Catch block
	java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
	stop
*/