/*We cannot use statements of after and before the catch block but 
we can use statements before try block and after catch block */
class Example13
{	public static void main(String args[])
	{	System.out.println("start");
		int a[]={10,20,30,40,50};
		try
		{
			System.out.println("Inside try Block..");
			System.out.println(a[20]);	
		}
		System.out.println("After Try Block-------");
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Inside Catch block ArrayIndexOutOfBoundsException");
		}
		System.out.println("stop");
	}
} 
/*
	Example13.java:6: error: 'try' without 'catch', 'finally' or resource declarations
					try
					^
	Example13.java:12: error: 'catch' without 'try'
					catch(ArrayIndexOutOfBoundsException ai)
					^
	2 errors
*/