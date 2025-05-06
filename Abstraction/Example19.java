interface It1
{	void m1();
}
class Example19 implements It1
{	public void m1()
	{
		System.out.println("Inside M1 Method");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		It1 i1=new Example19();
		i1.m1();
		System.out.println("Stop");
	}
}
/* output:
Start
Inside M1 Method
Stop
*/