class Staticmethod2
{
	public static void main(String args[])
	{
		//3 approches for method calling
		//directly
		m1();
		//classname
		Staticmethod1.m1();
		//object
		
	}
	static void m1()
	{
		System.out.println("Inside The M1 Method..--Before");
		return;
		System.out.println("Inside The M1 Method..--After");
		//the return method should only be used at the end of the method.
		//if it is used at the start or middle of the method it will throws an error..
		// o/p--> Error.
	}
}

