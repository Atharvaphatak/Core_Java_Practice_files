abstract class Demo
{	int a=100;
}
class Example13 extends Demo
{	float b=10.5f;
	public static void main(String args[])
	{	System.out.println("Start");
		Example13 ref=new Example13();
		System.out.println(ref.a+ref.b);
		System.out.println("Stop");
	}
}
/*
	Start
	110.5
	Stop
*/