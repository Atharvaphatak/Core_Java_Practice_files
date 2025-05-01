/*--But with the Concept of overriding it is not possible to perform upcasting and downcasting 
--based on the object created that respective class method will be call.. */
class Sample
{
	void m1()
	{	System.out.println("Inside M1 Method--Sample");
	}
}
class Demo extends Sample
{	
	void m1()
	{	System.out.println("Inside M2 Method--Demo");
	}
}
class Example23
{	public static void main(String args[])
	{	System.out.println("Start");
		Sample s=new Demo();
		s.m1();  
		System.out.println("Stop");
	}
}
/*
	Start
	Inside M2 Method--Demo
	Stop
*/