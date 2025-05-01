class Nonprimitivevar2
{	int a=500;
	void m1()
	{	System.out.println("Inside M1 Method");
	}
	public static void main(String args[])
	{	System.out.println("Start");
	    Nonprimitivevar2 np1=new Nonprimitivevar2();
		System.out.println(np1.a);
		np1.m1();
		test1(np1);//address.
		System.out.println("Stop");
	}
	static void test1(Nonprimitivevar2 np2)
	{	System.out.println("Inside the test Method");
		System.out.println(np2.a);
		np2.m1();
	}	
}
/*
Start
500
Inside M1 Method
Inside the test Method
500
Inside M1 Method
Stop
*/
