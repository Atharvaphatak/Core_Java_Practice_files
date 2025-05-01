//Runtime polymorphism
//rule 7a: To achieve overriding it is possible to override if the parent method access level 
//and child method access level is same.
class Demo
{	void m1()
	{	System.out.println("Inside M1 Method- Demo");
	}
}
class Sample extends Demo
{	void m1()
	{	System.out.println("Inside M1 Method- Sample");
	}
}
class Example28
{	public static void main(String args[])
	{	System.out.println("Start");
		Demo d=new Sample();
		d.m1();
		System.out.println("Stop");
	}
}
/*
	Start
	Inside M1 Method- Sample
	Stop
*/