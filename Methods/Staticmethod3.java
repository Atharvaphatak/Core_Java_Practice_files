class Staticmethod3
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
		return;
		return;
	}
		// o/p--> Error
		//unreachable statement
                //return;
}

