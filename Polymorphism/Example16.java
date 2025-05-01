class Sample
{	void m1()
	{	System.out.println("Inside m1 Method-sample");
	}
}
class Demo extends Sample
{	final void m1()
	{	System.out.println("Inside m1 Method- Demo");	
	}
}
class Example16
{	public static void main(String args[])
	{
		Demo d=new Demo();
		d.m1();
	}
}
//o/p-->> Inside m1 Method- Demo
