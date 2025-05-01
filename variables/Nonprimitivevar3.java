class Nonprimitivevar3
{	int a=600;
	void m1()
	{	System.out.println("Inside M1 Method");
	}
	public static void main(String args[])
	{	System.out.println("Start");
	    Nonprimitivevar3 ref2=test1();
		System.out.println("Inside Main");
		System.out.println(ref2.a);
		ref2.m1();
		System.out.println("Stop");
	}
	static Nonprimitivevar3 test1()
	{	System.out.println("Inside the test1 Method");
		Nonprimitivevar3 ref1=new Nonprimitivevar3();
		System.out.println(ref1.a);
		ref1.m1();
		return ref1;//return the address
	}	
}
/*
Start
Inside the test1 Method
600
Inside M1 Method
Inside Main
600
Inside M1 Method
Stop
*/

