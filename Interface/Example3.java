interface A
{	void m1();
}
interface B
{	void m1();
}
class Example3 implements B,A
{	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Example3 ref3=new Example3();
		ref3.m1();
		System.out.println("Stop");
	}		
}
/*
	Start
	Inside m1 method
	Stop
*/