//Runtime Polymorphism
//example1 based on rule no.1
class Parent
{	void m1()
	{	System.out.println("Inside m1 Method-Parent");
	}
}
class Child extends Parent
{	void m1()
	{	System.out.println("Inside m1 Method- Child");	
	}
}
class Example10
{	public static void main(String args[])
	{	
		Child c=new Child();
		c.m1();
	}
}
//o/p--> Inside m1 Method- Child
//the above program is not part of method overriding, so it is concept of inheritance.

