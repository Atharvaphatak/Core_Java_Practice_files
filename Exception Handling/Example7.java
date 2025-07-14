//It will not matter whatever exception is within catch block 
//until there is no exception raised within try block
class Example7
{	public static void main(String args[])
	{	System.out.println("start");
		try
		{
			System.out.println("Inside try Block..");	// new ArithmeticException()
			System.out.println(10/2);		
		}
		catch (NullPointerException npe)
		{
			System.out.println("Inside catch Block..");
		}
		System.out.println("stop");
	}
} //ArithmeticException ae=new ArithmeticException();
/* 
	start
	Inside try Block..
	5
	stop
*/
