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
class Example21
{	public static void main(String args[])
	{	System.out.println("Start");
		A a1=new C();
		a1.m1();
		B b1=(B)a1;
		b1.m1();  b1.m2();
		C c1=(C)b1;
		c1.m1();  c1.m2();  c1.m3();
		System.out.println("Stop");
	}
}
/*
	Start
	Inside M1 Method 10
	Inside M1 Method 10
	Inside M2 Method 200.5
	Inside M1 Method 10
	Inside M2 Method 200.5
	Inside M3 Method A
	Stop	
*/

