class Success
{	char x='B';
	void test2()
	{	System.out.println("Inside the Test2 Method");
	}
}
class Combo8
{	public static void main(String args[])
	{	System.out.println("Start");
		Combo8 c8=new Combo8();
		c8.m1();
		System.out.println("Stop");	
	}
	void m1()
	{	System.out.println("Inside the M1 Method");
		//1 approach -->object 
		Success ss=new Success();
		System.out.println(ss.x);
		ss.test2();
	}
}

