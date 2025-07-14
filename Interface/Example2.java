//Multiple inheritance is not supported by Java at class level, but multiple inheritance 
//is supported by Java at interface level.
interface A
{	void m1();
}
interface B
{	void m2();
}
class Example2 implements A,B
{	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public void m2()
	{
		System.out.println("Inside m2 method");
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Example2 ref2=new Example2();
		ref2.m1();
		ref2.m2();
		System.out.println("Stop");
	}		
}
/*
	Start
	Inside m1 method
	Inside m2 method
	Stop
*/