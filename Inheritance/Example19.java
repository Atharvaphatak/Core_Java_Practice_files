class Demo
{
	Demo(int a)
	{	System.out.println("Inside 1 Arg Constructor..>>Demo");
	}
}
class Sample extends Demo
{	
	Sample(char c)
	{
		System.out.println("Inside 1 Arg Const..>>Sample");
	}
}
class Example19
{	public static void main(String args[])
	{	
		System.out.println("Start");
		Sample s2=new Sample('A');
		System.out.println("Stop");
	}	
}
/*
ERROR:
 constructor Demo in class Demo cannot be applied to given types;
*/


