//constructor overloading 
//this example satisfy rule no1 
class Example5
{	Example5()
	{
		System.out.println("Inside 0 ARG Constructor");
	}
	Example5(int a)
	{
		System.out.println("Inside 1 ARG Constructor");
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Example5 ex=new Example5();
		System.out.println("Stop");
	}
}
/*
Start
Inside 0 ARG Constructor
Stop
*/