class Parent
{	int a=10;
	void m1()
	{	
		System.out.println("Inside M1 Method..");
	}
}
class Child extends Parent
{	float b=200.5f;
	void m2()
	{	
		System.out.println("Inside M2 Method..");
	}
}
class Example2
{	public static void main(String args[])
	{	
		Parent p=new Parent();
		System.out.println(p.a);
		p.m1();
		Child c=new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		c.m1();
		c.m2();
	}
}
/*
10
Inside M1 Method..
10
200.5
Inside M1 Method..
Inside M2 Method..
*/