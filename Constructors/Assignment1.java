//Q Create  2 constructors and call them with only 1 object..
class Demo
{	Demo()
	{	this(10);
		System.out.println("Inside Constructor1..");
	}
	Demo(int a)
	{ System.out.println("Inside Constructor2..");
	}	
}
class Assignment1
{	public static void main(String args[])
	{	System.out.println("Start");
		Demo d1=new Demo();
		System.out.println("Stop");
	}
}
/*
Start
Inside Constructor2..
Inside Constructor1..
Stop
*/
