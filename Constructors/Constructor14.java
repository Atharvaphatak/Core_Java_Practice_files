class Constructor14
{	int a;
	Constructor14(int a)
	{	this();
		System.out.println("Inside 0 arg Constructor..");
	}
	Constructor14()
	{	this(10);
		System.out.println("Inside 1 arg Constructor..");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Constructor14 refvar1=new Constructor14(10);
		System.out.println("Stop");
	}	
}
/*
o/p-->Error
Constructor14.java:8: error: recursive constructor invocation
        {       this(10);
                ^
1 error

*/
