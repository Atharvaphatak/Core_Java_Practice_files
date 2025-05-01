//Runtime Polymorphism
//example1 based on rule no.2
//rule no.2: It is possible to override if the parent method return type and child method return type 
//should be same at the primitive level.  
class Sample
{	int m1()
	{	System.out.println("Inside m1 Method-Sample");
		return 10;
	}
}
class Demo extends Sample
{	int m1()
	{	System.out.println("Inside m1 Method- Demo");
		return 100;
	}
}
class Example12
{	public static void main(String args[])
	{	
		Demo d=new Demo();
		d.m1();
	}
}
//o/p--> Inside m1 Method- Demo


