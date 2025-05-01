class Assignment3
{
	static
	{	
		System.out.println("Inside Static Block..");
		ref1.m1();
	}
	void m1()
	{	System.out.println("Inside M1 Method..");
	}

	public static void main(String args[])
	{	System.out.println("Start");
		Assignment3 ref1=new Assignment3();
		System.out.println("Stop");
	}
}
/*
Error
*/