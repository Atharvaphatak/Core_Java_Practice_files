//constructor overloading 
//this example satisfy both the rule 1&2
class Example7
{	Example7(int a)
	{
		System.out.println("Inside int Constructor");
	}
	Example7()
	{
		System.out.println("Inside 0 ARG Constructor");
	}
	Example7(float b)
	{
		System.out.println("Inside float Constructor");
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Example7 ex=new Example7();
		System.out.println("Stop");
	}
}
/*
Start
Inside 0 ARG Constructor
Stop
*/