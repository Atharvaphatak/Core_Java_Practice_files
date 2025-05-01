//constructor overloading 
//this example satisfy rule no2
class Example6
{	Example6(int a)
	{
		System.out.println("Inside int Constructor");
	}
	Example6(float b)
	{
		System.out.println("Inside float Constructor");
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Example6 ex=new Example6(100.5f);
		System.out.println("Stop");
	}
}
/*
Start
Inside float Constructor
Stop
*/