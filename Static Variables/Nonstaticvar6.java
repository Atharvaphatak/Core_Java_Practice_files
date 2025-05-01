class Cyber
{	int a=10;
	void m1()
	{	System.out.println("Inside M1 Method");
	}	
}
class Nonstaticvar6
{	public static void main(String args[])
	{	System.out.println("Start");
		Cyber c1=new Cyber();
		System.out.println(c1.a);
		c1.m1();
		System.out.println("Stop");
	}
}