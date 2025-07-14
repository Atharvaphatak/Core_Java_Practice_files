interface It1
{	default void m1()
	{	System.out.println("Inside M1 Method- Interface");
	}
}
class Example25 implements It1
{	public void m1()
	{	System.out.println("Inside M1 Method- Example24");
	}
	
	public static void main(String args[])
	{	System.out.println("Start");
		It1 i1=new Example25();
		i1.m1();
		System.out.println("Stop");
	}
}
/*
Start
Inside M1 Method- Example24
Stop
*/