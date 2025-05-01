final class Demo
{	void m1()
	{	System.out.println("Inside Static M1 Method..");
	}
}
class Sample extends Demo
{	void m2()
	{	System.out.println("Inside Static M2 Method..");
	}
}
class Example8
{	public static void main(String args[])
	{	Sample s=new Sample();
		s.m1();
		s.m2();
	}
}
/*
error: cannot inherit from final Demo
*/
	