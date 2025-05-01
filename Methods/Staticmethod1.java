class Staticmethod1
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
		System.out.println("Inside The M1 Method..");
		return;//the return method should only be used at the end of the method.
		//if it is used at the start or middle of the method it will throws an error..
		//return--> it is not mandatory to write becoz compiler can automatically set return type..
	}
}

