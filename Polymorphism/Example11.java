//Runtime Polymorphism
//example2 based on rule no.1
class Parent
{	void m1()
	{	System.out.println("Inside m1 Method-Parent");
	}
}
class Child extends Parent
{	void m1(int a)
	{	System.out.println("Inside m1 Method- Child");	
	}
}
class Example11
{	public static void main(String args[])
	{	
		Child c=new Child();
		c.m1();
	}
}
//o/p--> Inside m1 Method-Parent
//the above program is not part of method overriding, so it is concept of method overloading.

