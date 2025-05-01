class Demo
{	static void m1()
	{	System.out.println("Inside Static M1 Method..");
	}
}
class Sample extends Demo
{	static void m2()
	{	System.out.println("Inside Static M2 Method..");
	}
}
class Example5
{	public static void main(String args[])
	{	Sample s=new Sample();
		s.m1();
		s.m2();
	}
}
/*
Inside Static M1 Method..
Inside Static M2 Method..
*/
	