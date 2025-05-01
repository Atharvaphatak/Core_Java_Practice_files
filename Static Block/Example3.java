class Example3
{	
	static
	{
		System.out.println("Inside Static Block..1");
	}
	{
		System.out.println("Inside Non Static Block..2");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Example3 ref1=new Example3();
		Example3 ref2=new Example3();
		System.out.println("Stop");
	}
}
/*
Inside Static Block..1
Start
Inside Non Static Block..2
Inside Non Static Block..2
Stop
*/