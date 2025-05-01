class Demo
{	float b=200.5f;
	void m1()
	{	System.out.println("Inside M1 Method"+b);
	}
	static Demo ref;
}
class Nonprimitivevar7
{	public static void main(String args[])
	{	System.out.println("Start");
		//object -->ref-->non static member
		Demo.ref=new Demo();
		Demo.ref.m1();
		System.out.println("Stop");
	}
}
/*
Start
Inside M1 Method200.5
Stop
*/
