class Demo
{	private void m1()
	{	System.out.println("Inside M1 Method-Demo");
	}
}
class Sample extends Demo
{	void m1()
	{	System.out.println("Inside M1 Method-Sample");
	}
}
class Example27
{	public static void main(String args[])
	{
		Demo d=new Sample();
		d.m1();
		
	}
}
/*
	error: m1() has private access in Demo
                d.m1();
*/
