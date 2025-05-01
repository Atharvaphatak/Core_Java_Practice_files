class Combo5
{	static int a=500;
	static void test1()
	{	System.out.println("Start test1");
		System.out.println("Inside STATIC METHOD..");
		System.out.println("Stop test1");
	}
	public static void main(String args[])
	{	System.out.println("Start main");
		//call static variable directly --> valid..
		System.out.println(a);
		//call static method directly--> valid..
		test1();
		//classname --> valid
		//object --> valid
		Combo5 c2=new Combo5();
		System.out.println(c2.a);
		c2.test1();
		//call NON STATIC METHOD "M1" only with object creation..
		c2.m1();
		System.out.println("Stop main");
	}
	void m1()
	{	System.out.println("Start M1");
		System.out.println("Inside NON STATIC M1 Method..");

		//1 Approach--> Directly
		System.out.println(a);
		test1();
		//2 Approach--> Classname
		System.out.println(Combo5.a);
		Combo5.test1();
		// 3 Approach--> Object
		Combo5 c2=new Combo5();
		System.out.println(c2.a);
		c2.test1();
		System.out.println("Stop M1");
	}	
}



