/*Never use generic statements within triblog as within the try block 
we write only those statements which will rise an exception*/ 
/*Never ever write generic statements after the exceptions,
chances are there it never get executed */
class Example8
{	public static void main(String args[])
	{	System.out.println("start");
		try
		{
			System.out.println(10/0);
			System.out.println("Inside try Block..");	
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside catch Block..");
		}
		System.out.println("stop");
	}
} 
/* 
	start
	Inside catch Block..
	stop
*/
