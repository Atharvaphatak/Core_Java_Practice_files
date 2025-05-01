abstract class Demo
{	abstract void m1();
	void m2()
	{
		System.out.println("Inside M2 Method-- Demo");
	}
}
class Sample extends Demo
{	void m1()
	{
		System.out.println("Inside M1 Method-- Sample");
	}
}
class Example4
{	public static void main(String args[])
	{	System.out.println("Start");
		Sample s=new Sample();
		s.m1();
		s.m2();
		System.out.println("Stop");
	}
}
/*
	Start
	Inside M1 Method-- Sample
	Inside M2 Method-- Demo
	Stop
*/
	
	