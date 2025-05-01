//Super Stmt or Method
class Demo
{	Demo()
	{	System.out.println("Inside 0 Arg Const..>>Demo");
	}
}
class Sample extends Demo
{	Sample()
	{	super();
		System.out.println("Inside 0 Arg Const..>>Sample");
	}
	
}
class Example12
{	public static void main(String args[])
	{	System.out.println("Start");
		Sample Ss=new Sample();
		System.out.println("Stop");
	}
}
/*
Start
Inside 0 Arg Const..>>Demo
Inside 0 Arg Const..>>Sample
Stop
*/
	