class Constructor12
{	Constructor12()
	{	System.out.println("Inside 0 arg Constructor..");
	}
	void m1()
	{	this();//do not use this() stmt in any method..
		System.out.println("Inside M1 Method..");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Constructor12 ref1=new Constructor12();
		ref1.m1();
		System.out.println("Stop");
	}	
}
/*
o/p-->Error
conclusion=Constructor12.java:6: error: call to this must be first statement in constructor
        {       this();
Note: this() statement or Method will never work within the method as they 
are also responsible for execution during object creation 

*/
