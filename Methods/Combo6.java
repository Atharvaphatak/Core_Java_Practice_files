//which quadrant?
//which Area?
//which Members?
class Cyber
{	static int a=600;
	static void test1()
	{	System.out.println("Inside the Test1 Method");
	}
}
class Combo6
{	public static void main(String args[])
	{	System.out.println("Start");
		Combo6 c3=new Combo6();
		c3.m1();
		System.out.println("Stop");	
	}
	
	void m1()
	{	System.out.println("Inside the M1 Method");
		//1 approach--> Classname
		System.out.println(Cyber.a);
		Cyber.test1();	
		//2 approach--> Object
		Cyber c4=new Cyber();
		System.out.println(c4.a);
		c4.test1();
	}
}

