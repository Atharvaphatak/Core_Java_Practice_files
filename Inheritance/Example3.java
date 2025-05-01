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
class C extends B
{	char c='A';
	void m3()
	{	
		System.out.println("Inside M3 Method..");
	}
}
class Example3
{	public static void main(String args[])
	{	
		A ref1=new A();
		ref1.m1();
		
		B ref2=new B();
		ref2.m1();
		ref2.m2();
		
		C ref3=new C();
		ref3.m1();
		ref3.m2();
		ref3.m3();		
	}
}
/*
Inside M1 Method..
Inside M1 Method..
Inside M2 Method..
Inside M1 Method..
Inside M2 Method..
Inside M3 Method..
*/