class Constructor11
{	Constructor11()
	{	this(10);
		System.out.println("Inside 0 arg Constructor..");
	}
	Constructor11(int a)
	{	this(20.5f);
		System.out.println("Inside 1 arg Constructor..");
	}
	Constructor11(float b)
	{	System.out.println("Inside 2 arg Constructor..");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Constructor11 ref1=new Constructor11();
		System.out.println("Stop");
	}	
}
/*
Start
Inside 2 arg Constructor..
Inside 1 arg Constructor..
Inside 0 arg Constructor..
Stop
*/
