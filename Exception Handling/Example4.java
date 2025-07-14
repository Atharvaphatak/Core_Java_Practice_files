class Example4
{
	public static void main(String args[])
	{	System.out.println("start");
		try
		{
			System.out.println("Inside try Block..");// new ArithmeticException()
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
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
	Inside catch Block..
	5
	stop
*/