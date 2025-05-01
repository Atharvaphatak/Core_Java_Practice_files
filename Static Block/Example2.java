class Example2
{	
	static
	{
		System.out.println("Inside Static Block..1");
	}
	static
	{
		System.out.println("Inside Static Block..2");
	}
	public static void main(String args[])
	{	System.out.println("Start");
	
		System.out.println("Stop");
	}
}
/*
Inside Static Block..1
Inside Static Block..2
Start
Stop
*/