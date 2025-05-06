abstract class Demo
{	
	{	
		System.out.println("Inside Non Static block ");
	}
	Demo()
	{	System.out.println("Inside Demo Constructor");
	}
}
class Example12 extends Demo
{	
	{	System.out.println("Inside Non Static block ");
	}
	Example12()
	{	System.out.println("Inside Example10 Constructor");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Example12 ref=new Example12();
		System.out.println("Stop");
	}
}
/*
	Start
	Inside Non Static block
	Inside Demo Constructor
	Inside Non Static block
	Inside Example10 Constructor
	Stop	
*/