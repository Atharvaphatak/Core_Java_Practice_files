//Runtime Polymorphism
//example1 based on rule no.3
//rule no.3a: It is possible to override if the parent method return type and child method return type 
//should be same at the class level.  
class Tech
{
}
class Sample
{	
	Tech m1()
	{	System.out.println("Inside m1 Method-Sample return ref");
		Tech ref=new Tech();
		return ref;
	}
}
class Demo extends Sample
{	
	Tech m1()
	{	System.out.println("Inside m1 Method-Demo return ref");
		Tech ref=new Tech();
		return ref;
	}
}
class Example13
{	public static void main(String args[])
	{	
		Demo d=new Demo();
		d.m1();
	}
}
//o/p--> Inside m1 Method-Demo return ref


