class Cyber
{	void m1()
	{	System.out.println("Inside M1 Method");
	}	
}
class Nonstaticvar7
{	int a=200;
	public static void main(String args[])
	{	System.out.println("Start");
		Nonstaticvar7 var1=new Nonstaticvar7();
		System.out.println(var1.a);
		Cyber var2=new Cyber();
		var2.m1();
		System.out.println("Stop");
	}
}