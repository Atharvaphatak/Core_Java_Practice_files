class Demo
{
	Demo()
	{	System.out.println("Inside 0 Arg Constructor..>>Demo");
	}
}
class Sample extends Demo
{	
}
class Example14
{
	public static void main(String args[])
	{	
		System.out.println("Start");
		Sample ss=new Sample();
		System.out.println("Stop");
	}	
}
/*
Start
Inside 0 Arg Constructor..>>Demo
Stop
*/


