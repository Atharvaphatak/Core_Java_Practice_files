class Demo
{	int x=100;
	static float y=200.5f;
	static void m1()
	{	System.out.println("Inside M1 Method");
		Demo d=new Demo();
		System.out.println(d.x+y);
	}
	void m2()
	{	System.out.println("Inside M2 Method");
		System.out.println(x+y);
	}
}
class Example6
{	public static void main(String args[])
	{	System.out.println("Start");
		Demo.m1();
		Demo dd=new Demo();
		dd.m2();
		System.out.println("Stop");
	}
}
/* o/p-->
Start
Inside M1 Method
300.5
Inside M2 Method
300.5
Stop
*/
		