//Without the concept of overriding it is possible to perform upcasting and downcasting. 
class Sample
{
	void m1()
	{	System.out.println("Inside M1 Method");
	}
}
class Demo extends Sample
{	
	void m2()
	{	System.out.println("Inside M2 Method");
	}
}
class Example22
{	public static void main(String args[])
	{	System.out.println("Start");
		Sample s=new Demo();
		s.m1();  //s.m2();//upcasting
		Demo d=(Demo)s;
		d.m1(); d.m2();//downcating 
		System.out.println("Stop");
	}
}
/*
	Start
	Inside M1 Method
	Inside M1 Method
	Inside M2 Method
	Stop
*/