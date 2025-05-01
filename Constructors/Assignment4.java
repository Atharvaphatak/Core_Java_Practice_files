class Assignment4
{	static int a;
	Assignment4()
	{	System.out.println("Inside Constructor.."+a);
		a=10;
		System.out.println(a);
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Assignment4 ref1=new Assignment4();
		System.out.println("Stop");
	}
}
/*
Start
Inside Constructor..0
10
Stop
*/
