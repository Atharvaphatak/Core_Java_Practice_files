class A
{	void m1()
	{	
		System.out.println("Inside M1 Method..");
	}
}
class B extends A
{	void m2()
	{	
		System.out.println("Inside M2 Method..");
	}
}
class C extends B
{	void m3()
	{	
		System.out.println("Inside M3 Method..");
	}
}
class D extends A
{	void m4()
	{	
		System.out.println("Inside M4 Method..");
	}
}
class E extends D
{	void m5()
	{	
		System.out.println("Inside M5 Method..");
	}
}

class Example7
{	public static void main(String args[])
	{	
		C c1=new C();
		c1.m1();
		c1.m2();
		c1.m3();
		E e1=new E();
		e1.m1();
		e1.m4();
		e1.m5();
	}
}
/*
Inside M1 Method..
Inside M2 Method..
Inside M3 Method..
Inside M1 Method..
Inside M4 Method..
Inside M5 Method..
*/