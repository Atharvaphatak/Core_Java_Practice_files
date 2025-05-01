//this example satisfy rule no1 
class Example1
{	void m1()
	{
		System.out.println("Inside M1 Method--0 ARG");
	}
	void m1(int a)
	{
		System.out.println("Inside M1 Method--1 ARG");
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Example1 ex=new Example1();
		ex.m1(10);
		System.out.println("Stop");
	}
}
/*
Start
Inside M1 Method--1 ARG
Stop
*/