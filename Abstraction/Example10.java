abstract class Demo
{	Demo()
	{	System.out.println("Inside Demo Constructor");
	}
}
class Example10 extends Demo
{	Example10	()
	{	//super();
		System.out.println("Inside Example10 Constructor");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Example10 ref=new Example10();
		System.out.println("Stop");
	}
}
/*
	Start
	Inside Demo Constructor
	Inside Example10 Constructor
	Stop
*/