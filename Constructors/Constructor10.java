class Constructor10
{	Constructor10()
	{	System.out.println("Inside 0 arg Constructor..");
		this(10);
	}
	Constructor10(int a)
	{	System.out.println("Inside 1 arg Constructor..");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Constructor9 ref1=new Constructor9();
		System.out.println("Stop");
	}	
}
/*
Error...
Constructor10.java:4: error: CALL TO THIS MUST BE FIRST STATEMENT IN CONSTRUCTOR
                this(10);*/
