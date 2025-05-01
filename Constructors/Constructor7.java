class Constructor7
{	int a;
	Constructor7()
	{	System.out.println("Inside 1 arg Constructor.."+a);
		a=10;
	}
	void m1()
	{	System.out.println("Inside M1 Method.."+a);
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Constructor7 ref1=new Constructor7();
		ref1.m1();
		System.out.println("Stop");
	}
}
/*
Start
Inside 1 arg Constructor..0
Inside M1 Method..10
Stop
*/