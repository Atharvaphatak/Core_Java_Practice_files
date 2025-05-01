class Demo
{	{
		System.out.println("Inside Non Static Block.. 1 ");
	}
	Demo()
	{	System.out.println("Inside 0 Arg Constructor..>>Demo");
	}
}
class Sample extends Demo
{	
	{	System.out.println("Inside Non Static Block.. 2 ");
	}
	Sample()
	{	//super();
		System.out.println("Inside 0 Arg Const..>>Sample");
	}
}
class Example20
{	public static void main(String args[])
	{	
		System.out.println("Start");
		Sample ss=new Sample();
		System.out.println("Stop");
	}	
}
/*
Start
Inside Non Static Block.. 1
Inside 0 Arg Constructor..>>Demo
Inside Non Static Block.. 2
Inside 0 Arg Const..>>Sample
Stop
*/


