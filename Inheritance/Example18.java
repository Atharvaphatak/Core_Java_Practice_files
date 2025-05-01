class Demo
{
	Demo()
	{	System.out.println("Inside 0 Arg Constructor..>>Demo");
	}
}
class Sample extends Demo
{	
	Sample(char c)
	{	//super();>>compiler sets bydefault super() stmt here
		System.out.println("Inside 1 Arg Const..>>Sample");
	}
	Sample()
	{	//super();>>compiler sets bydefault super() stmt here
		System.out.println("Inside 0 Arg Const..>>Sample");
	}
}
class Example18
{	public static void main(String args[])
	{	
		System.out.println("Start");
		Sample s1=new Sample();
		Sample s2=new Sample('A');
		System.out.println("Stop");
	}	
}
/*
Start
Inside 0 Arg Constructor..>>Demo
Inside 0 Arg Const..>>Sample
Inside 0 Arg Constructor..>>Demo
Inside 1 Arg Const..>>Sample
Stop
*/


