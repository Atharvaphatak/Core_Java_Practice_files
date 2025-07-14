class Example28
{
	public static void main(String args[])
	{
		System.out.pritnln("Start");
		System.out.pritnln(10/0);
		finally 
		{
			System.out.pritnln("Inside Finally Block");
		}
		System.out.pritnln("Stop");
	}
}
/*
Example28.java:7: error: 'finally' without 'try'
                finally
                ^
1 error
*/
