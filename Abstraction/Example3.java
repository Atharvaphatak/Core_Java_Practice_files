//we can not create an object of abstract class..
abstract class Demo
{	
	abstract void m1();
}
class Example3
{	public static void main(String args[])
	{	System.out.println("Start");
		Demo dd=new Demo();  
		dd.m1();
		System.out.println("Stop");
	}
}
/*
Error: 
	Example3.java:9: error: Demo is abstract; cannot be instantiated
                Demo dd=new Demo();
                        ^
	1 error
*/
