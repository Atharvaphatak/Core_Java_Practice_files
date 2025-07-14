/*If an exception is raised within try block it will handle by the catch block, but
if an exception is raised within the catch block it will lead to an abnormal termination*/
class Example9
{	public static void main(String args[])
	{	System.out.println("start");
	int a[]={10,20,30,40,50};
		try
		{
			System.out.println("Inside try Block..");
			System.out.println(10/0);	
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside catch Block..");
			System.out.println(a[11]);
		}
		System.out.println("stop");
	}
} 
/*
start
Inside try Block..
Inside catch Block..
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 5
        at Example9.main(Example9.java:13)
*/