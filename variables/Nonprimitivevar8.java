class Demo
{	boolean b=true;
	void test2()
	{	System.out.println("Inside M1 Method"+b);
	}
	static Demo ref;
}
class Sample
{	static Demo ref;
}
class Nonprimitivevar8
{	public static void main(String args[])
	{	System.out.println("Start");
		Sample.ref=new Demo();
		Sample.ref.test2();
		System.out.println("Stop");
	}
}
/*
Start
Inside M1 Methodtrue
Stop
*/
