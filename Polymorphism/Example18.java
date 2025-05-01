class Parent
{	int a=10;
	void m1()
	{	System.out.println("Inside M1 Method");
	}
}
class Child extends Parent
{	float b=200.5f;
	void m2()
	{	System.out.println("Inside M2 Method");
	}
} 
class Example18
{	public static void main(String args[])
	{	System.out.println("Start");
		//Upcasting
		Parent p=new Child();
		System.out.println(p.a);
		p.m1();
		//p.m2();
	    System.out.println("--------------------------");
		
		//Downcasting
		Child c=(Child)p;
		c.m1();
		c.m2();
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

