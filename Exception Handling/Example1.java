class Example1
{
	public static void main(String args[])
	{
		System.out.println("start");
		System.out.println(10/0); 
		System.out.println("stop");
	}
}
/*
	start
	Exception in thread "main" java.lang.ArithmeticException: / by zero
			at Example1.main(Example1.java:6)
*/