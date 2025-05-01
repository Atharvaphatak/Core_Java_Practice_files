abstract class Demo
{	abstract void m1();		//abstract method
	void m2()
	{	System.out.println("Inside M2 Method-- Demo");
	}
}
class Sample extends Demo
{	void m1()
	{	System.out.println("Inside M1 Method-- Sample");
	}
	void m3()
	{	System.out.println("Inside M3 Method-- Sample");
	}
}
class Example5
{	public static void main(String args[])
	{	System.out.println("Start");
		Demo d=new Sample();
		d.m1();//overriding
		d.m2();//no overriding(upcasting)
		//d.m3();// error --> preference goes to parent class..
		System.out.println("Stop");
	}
}
/*
	Start
	Inside M1 Method-- Sample
	Inside M2 Method-- Demo
	Stop
*/
	
	