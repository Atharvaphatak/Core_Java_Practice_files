//Super Keyword
//parent class,Base class,Derived class
class Demo
{	int a=100;
}
//child class,super class,sub class
class Sample extends Demo
{	int b=200;
	void m1(int a)
	{	System.out.println("Inside M1 Method..");
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
class Example9
{	public static void main(String args[])
	{	System.out.println("Start");
		Sample s=new Sample();
		s.m1(300);
		System.out.println("Stop");
	}
}
/*
Start
Inside M1 Method..
300
100
100
Stop
*/
	