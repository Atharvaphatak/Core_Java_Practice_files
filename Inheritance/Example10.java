class Demo
{	void m1()
	{
		System.out.println("Inside M1 Method..");
	}
}
class Sample extends Demo
{	void m2()
	{
		System.out.println("Inside M2 Method..");
	}
	void test()
	{	System.out.println("Inside test Method..");
		m1();
		m2();
		super.m1();
	}
}
class Example10
{	public static void main(String args[])
	{	System.out.println("Start");
		Sample s=new Sample();
		s.test();
		System.out.println("Stop");
	}
}
/*
Start
Inside test Method..
Inside M1 Method..
Inside M2 Method..
Inside M1 Method..
Stop
*/
	