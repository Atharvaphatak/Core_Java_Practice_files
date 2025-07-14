class Example3
{
	public static void main(String args[])
	{
		System.out.println("start");
		Thread.sleep(3000);//milli second
		System.out.println("stop");
	}
}
//public static void sleep(long)
//InterruptedException
/* CE-->
Example3.java:6: error: unreported exception InterruptedException; must be caught or declared to be thrown
                Thread.sleep(3000);//milli second                            ^
1 error

*/