class Demo
{	interface Sample
	{	void test();
	}
}
class Example23 implements Demo.Sample
{	public void test()
	{	System.out.println("Inside Test Method..");
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Example23 ref =new Example23();
		ref.test();
		System.out.println("Stop");
	}
}
/*
	Start
	Inside Test Method..
	Stop
*/
