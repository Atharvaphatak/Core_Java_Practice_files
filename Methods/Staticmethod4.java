class Staticmethod4
{
	public static void main(String args[])
	{
		//directly
		m1();
		//return;
	}
	static void m1()
	{
		System.out.println("Inside The M1 Method..");
		//return;
		//if we do not write return stmt within a method then the compiler will set the 
		//return stmt at the end of the method defaultly..
	}
	
}

