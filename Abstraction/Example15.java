//Assisgnment 
interface It1
{	void m1();
	void m2();
}
class Example15 implements It1
{	public void m1()
	{	System.out.println("Inside m1 Method");
	}
	public void m2()
	{	System.out.println("Inside m2 Method");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Example15 ref1=new Example15();
		ref1.m1();
		ref1.m2();
		System.out.println("Stop");
	}
}
/*
	Start
	Inside m1 Method
	Inside m2 Method
	Stop
*/