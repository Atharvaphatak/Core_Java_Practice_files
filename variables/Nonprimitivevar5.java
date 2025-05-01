class Nonprimitivevar5
{	char x='a';
	void m1()
	{	System.out.println("Inside M1 Method");
	}
	static Nonprimitivevar5 ref=new Nonprimitivevar5();
	public static void main(String args[])
	{	System.out.println("Start");
		System.out.println(ref.x);
		ref.m1();
		System.out.println("Stop");
	}	
}
/*
Start
a
Inside M1 Method
Stop
*/
