class A
{	int a=10;
	void m1()
	{	
		System.out.println("Inside M1 Method..");
	}
}
class B extends A
{	float b=200.5f;
	void m2()
	{	
		System.out.println("Inside M2 Method..");
	}
}
class C extends A
{	char c='A';
	void m3()
	{	
		System.out.println("Inside M3 Method..");
	}
}
class D extends A
{	boolean bar=true;
	void m4()
	{	
		System.out.println("Inside M4 Method..");
	}
}
class Example4
{	public static void main(String args[])
	{	
		A ref1=new A();
		ref1.m1();
		
		B ref2=new B();
		ref2.m2();
		ref2.m1();
		
		C ref3=new C();
		ref3.m3();
		ref3.m1();
		
		D ref4=new D();
		ref4.m4();
		ref4.m1();
	}
}
/*
Inside M1 Method..
Inside M2 Method..
Inside M1 Method..
Inside M3 Method..
Inside M1 Method..
Inside M4 Method..
Inside M1 Method..
*/