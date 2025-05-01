class A
{	int a=10;
	void m1()
	{	System.out.println("Inside M1 Method");
	}
}
class B extends A
{	float b=200.5f;
	void m2()
	{	System.out.println("Inside M2 Method");
	}
} 
class C extends B
{	char c='A';
	void m3()
	{	System.out.println("Inside M3 Method");
	}
} 
class Example19
{	public static void main(String args[])
	{	System.out.println("Start");
		//Upcasting
		B b1=new C();
		b1.m1(); b1.m2();
		
		A a2=new C();
		a2.m1(); //a2.m2(); a2.m3(); 
	    
		A a1=(A)b1;
		a1.m1();
		System.out.println("--------------------------");
		//Downcasting
		C c1=(C)a1;
		c1.m1();  c1.m2();  c1.m3();
		
		B b2=(B)a2;
		b2.m1(); b2.m2();
		
		C c2=(C)b2;
		c2.m1(); c2.m2(); c2.m3();
		System.out.println("Stop");
	}
}
/*
	Start
	10
	Inside M1 Method
	--------------------------
	Inside M1 Method
	Inside M2 Method
	Stop
*/

