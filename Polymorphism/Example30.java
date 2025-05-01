//Runtime polymorphism
//Rule 7c: It is not possible to override if the method access level is from wider to narrow. 
class Demo
{	public void m1()								// protected access modifier
	{	System.out.println("Inside M1 Method- Demo");
	}
}
class Sample extends Demo
{	protected void m1()								//  Default access modifier
	{	System.out.println("Inside M1 Method- Sample");
	}
}
class Example30
{	public static void main(String args[])
	{	System.out.println("Start");
		Demo d=new Sample();
		d.m1();
		System.out.println("Stop");
	}
}
/*
Error:
	Example30.java:9: error: m1() in Sample cannot override m1() in Demo
{       protected void m1()                                                             // access modifier
                       ^
  attempting to assign weaker access privileges; was public
1 error
*/