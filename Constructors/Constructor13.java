class Constructor13
{	int a;
	Constructor13(int a)
	{	this(10.5f);		//this method
		this.a=a;			//this keyword
		System.out.println("Inside 0 arg Constructor..");
	}
	Constructor13(float b)
	{	System.out.println("Inside 1 arg Constructor..");
	}
	void m1(int a)
	{	System.out.println("Inside M1 Method");
		this.a=a;
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Constructor13 ref1=new Constructor13(10);
		ref1.m1(100);
		System.out.println("Stop");
	}	
}
/*
Start
Inside 1 arg Constructor..
Inside 0 arg Constructor..
Inside M1 Method
Stop
*/
