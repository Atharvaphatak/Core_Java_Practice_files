class Cyber
{	void m1()
	{	System.out.println("Inside M1 Method--Cyber");
	}
	void m2()
	{	System.out.println("Inside M2 Method--Cyber");
	}
}
class Success extends Cyber
{	void m2()
	{	System.out.println("Inside M2 Method--Success");
	}
	void m3()
	{	System.out.println("Inside M3 Method--Success");
	}
}
class Example24
{	public static void main(String args[])
	{	System.out.println("Start");
		Cyber c=new Success();
		c.m1();
		c.m2();
		//c.m3();
		System.out.println("Stop");
	}
}
/*
	Start
	Inside M2 Method--Demo
	Stop
*/