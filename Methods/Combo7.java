class Combo7
{	char x='A';
	void test2()
	{	System.out.println("Inside the Test2 Method");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Combo7 c5=new Combo7();
		c5.m1();
		System.out.println("Stop");	
	}
	void m1()
	{	System.out.println("Inside the M1 Method");
		//1 approach -->directly
		System.out.println(x);
		test2();
		//2 approach -->object 
		Combo7 c6=new Combo7();
		System.out.println(c6.x);
		c6.test2();
	}
}

