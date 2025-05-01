class Demo
{
	Demo()
	{	System.out.println("Inside 0 Arg Constructor..>>Demo");
	}
}
class Sample extends Demo
{	
	Sample()
	{ 
		super();
		System.out.println("Inside 0 Arg Const..>> Sample");
	}
}
class Example13
{
	public static void main(String args[])
	{	System.out.println("Start");
		Sample ss=new Sample();
		System.out.println("Stop");
	}	
}
/*
Start
Inside 0 Arg Constructor..>>Demo
Inside 0 Arg Const..>> Sample
Stop
*/


