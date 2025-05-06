interface It1
{	void m1();
}
class Example16 implements It1
{	public void m1()
	{	System.out.println("Inside m1 Method");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Example16 ref1=new Example16();
		ref1.m1();
		System.out.println("Stop");
	}
}
/*
Start
Inside m1 Method
Stop
*/