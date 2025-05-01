class Demo
{
	Demo()
	{	System.out.println("Inside 0 Arg Constructor..>>Demo");//---1
	}
	Demo(int a)
	{	this();
		System.out.println("Inside 1 Arg Constructor..>>Demo");//---2
	}
}
class Sample extends Demo
{	Sample(float b)
	{	super(10);
		System.out.println("Inside 1 Arg Const..>>Sample");//--3
	}
	Sample()
	{	this(10.5f);
		System.out.println("Inside 0 Arg Const..>>Sample");//--4
	}
}
class Example16
{	public static void main(String args[])
	{	System.out.println("Start");
		Sample ss=new Sample();
		System.out.println("Stop");
	}	
}
/*
Start
Inside 0 Arg Constructor..>>Demo
Inside 1 Arg Constructor..>>Demo
Inside 1 Arg Const..>>Sample
Inside 0 Arg Const..>>Sample
Stop
*/


