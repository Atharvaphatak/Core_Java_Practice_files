class Example5
{	public static void main(String args[])
	{	
		System.out.println("start");
		try
		{
			System.out.println("Inside try Block..");// new ArithmeticException()
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside catch Block..");
		}
		System.out.println("stop");
	}
} //ArithmeticException ae=new ArithmeticException();
/* 
	start
	Inside try Block..
	stop
*/