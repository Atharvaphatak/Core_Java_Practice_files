abstract class Demo
{	Demo()
	{	
		System.out.println("Inside Demo Constructor 1 ");
	}
	Demo(int a)
	{	this();
		System.out.println("Inside Demo Constructor 2 ");
	}
}
class Example11 extends Demo
{	Example11(float b)
	{	super(10);
		System.out.println("Inside Example10 Constructor 1 ");
	}
	Example11()
	{	this(10.5f);
		System.out.println("Inside Example10 Constructor 2 ");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Example11 ref=new Example11();
		System.out.println("Stop");
	}
}
/*
	Start
	Inside Demo Constructor 1
	Inside Demo Constructor 2
	Inside Example10 Constructor 1
	Inside Example10 Constructor 2
	Stop	
*/