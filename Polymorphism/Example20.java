//H.W
class A
{	int a=10;
	void m1()
	{	System.out.println("Inside M1 Method "+a);
	}
}
class B extends A
{	float b=200.5f;
	void m2()
	{	System.out.println("Inside M2 Method "+b);
	}
} 
class C extends B
{	char c='A';
	void m3()
	{	System.out.println("Inside M3 Method "+c);
	}
} 
class Demo
{	static void test(A a1)
	{	System.out.println("Inside Test Method");
		a1.m1();
	}
}
class Example20
{	public static void main(String args[])
	{	System.out.println("Start");
		Demo.test(new C());
		System.out.println("Stop");
	}
}
/*
	Start
	Inside Test Method
	Inside M1 Method 10
	Stop	
*/

