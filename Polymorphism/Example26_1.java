//runtime polymorphism
//rule 5: 1)
class Demo
{	void m1()
	{	System.out.println("Inside M1 Method-Demo");
	}
}
class Sample extends Demo
{	void m1()
	{	System.out.println("Inside M1 Method-Sample");
	}
}
class Example26_1
{
	public static void main(String args[])
	{
		System.out.println("Start");
		Demo d=new Sample();
		d.m1();
		System.out.println("Stop");
	}
}
/*
	Start
	Inside M1 Method-Sample
	Stop
*/
