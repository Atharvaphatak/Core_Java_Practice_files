class Example5
{	static int a;
	static
	{	System.out.println("Inside Static Block.."+a);
		a=10;
	}
	public static void main(String args[])
	{	System.out.println("Start");
		System.out.println("Inside Main.."+a);
		System.out.println("Stop");
	}
}
//o/p-->
/*
Inside Static Block..0
Start
Inside Main..10
Stop
*/