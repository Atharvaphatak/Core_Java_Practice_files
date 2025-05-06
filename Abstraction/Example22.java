interface It1
{	interface It2
	{	void m1();
	}
}
class Example22 implements It1.It2
{	public void m1()
	{	System.out.println("Inside M1 Method..");
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Example22 ref =new Example22();
		ref.m1();
		System.out.println("Stop");
	}
}
/*
	Start
	Inside M1 Method..
	Stop
*/
