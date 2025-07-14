interface It1
{	default void m1()
	{	System.out.println("Inside M1 Method");
	}
}
class Example24 implements It1
{	public static void main(String args[])
	{	System.out.println("Start");
		Example24 ref1 =new Example24();
		ref1.m1();
		It1 ref2=new Example24();
		ref2.m1();
		System.out.println("Stop");
	}
}
/*
Start
Inside M1 Method
Inside M1 Method
Stop
*/