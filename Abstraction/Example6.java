abstract class Demo
{	abstract void m1();		//abstract method
	void m2()
	{	System.out.println("Inside M2 Method-- Demo");
	}
	void m3()
	{	System.out.println("Inside M3 Method-- Demo");
	}
}
class Sample extends Demo
{	void m1()
	{	System.out.println("Inside M1 Method-- Sample");
	}
	void m2()
	{	System.out.println("Inside M2 Method-- Sample");
	}
}
class Example6
{	public static void main(String args[])
	{	System.out.println("Start");
		Demo d=new Sample();
		d.m1();		//Sample
		d.m2();		//Sample
		d.m3();		// Demo 
		System.out.println("Stop");
	}
}
/*
	Start
	Inside M1 Method-- Sample
	Inside M2 Method-- Sample
	Inside M3 Method-- Demo
	Stop
*/
	
	