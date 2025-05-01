class Example4
{	public static void main(String args[])
	{	System.out.println("Start");
		Example4 obj1=new Example4();
		obj1.test1();
		System.out.println("Stop");
	}
	void test1()
	{	System.out.println("Inside test1");
		m1();
	}
	static void m1()
	{	System.out.println("Inside m1 Method");
	}
}