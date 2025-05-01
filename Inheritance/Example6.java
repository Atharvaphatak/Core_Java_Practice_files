//Multiple Inheritance 
class A
{	void m1()
	{	System.out.println("Inside Static M1 Method..");
	}
}
class B 
{	void m2()
	{	System.out.println("Inside Static M2 Method..");
	}
}
class C extends A,B
{	
}
class Example6
{	public static void main(String args[])
	{	
	}
}
/*
it will throws an error..
*/
	