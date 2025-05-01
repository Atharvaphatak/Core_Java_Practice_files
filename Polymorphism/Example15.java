//Runtime Polymorphism
//example1 based on rule no.4
//rule no.4: Final Methods con not be overridden.
class Sample
{	
	final void m1()//overrridden  method
	{	System.out.println("Inside m1 Method-Sample");
	}
}
class Demo extends Sample
{	
	void m1()//overrriding method
	{	System.out.println("Inside m1 Method-Demo");
	}
}
class Example15
{	public static void main(String args[])
	{	
		Demo d=new Demo();
		d.m1();
	}
}
//o/p--> Error
/*
Example15.java:12: error: m1() in Demo cannot override m1() in Sample
        void m1()
             ^
  overridden method is final
1 error
*/

