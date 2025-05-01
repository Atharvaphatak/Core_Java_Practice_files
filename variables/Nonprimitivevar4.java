class Demo
{	char x='x';
	void method1()
	{	System.out.println("Inside Method1");
	}
}
class Nonprimitivevar4
{	public static void main(String args[])
	{	System.out.println("Start");
		Demo d=new Demo();
		Demo d1=test1(d);
		Nonprimitivevar4 ref=new Nonprimitivevar4();
	    Demo d2=ref.test2(d);
		System.out.println("Main d:"+d);
		System.out.println("Test1:"+d1);
		System.out.println("Test2:"+d2);
		System.out.println("Stop");
	}
	static Demo test1(Demo d)
	{	System.out.println("Inside test1 Method");
		System.out.println(d.x);
		d.method1();
		return d;
	}	
	Demo test2(Demo d)
	{	System.out.println("Inside Test2 Method");
		System.out.println(d.x);
		d.method1();
		return d;
	}
}
/*
Start
Inside test1 Method
x
Inside Method1
Inside Test2 Method
x
Inside Method1
Main d:Demo@28a418fc
Test1:Demo@28a418fc
Test2:Demo@28a418fc
Stop
*/