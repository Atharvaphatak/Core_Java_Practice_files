class Constructor3
{	Constructor3()
	{	System.out.println("Inside the 0 arg Constructor..");
	}
	/*Constructor3()				------------------------>    do not create duplicate constructor 
																		in single java program
	{	System.out.println("Inside the 0 arg Constructor..");
	}*/
	Constructor3(int a)
	{	System.out.println("Inside the 1 arg Constructor..");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Constructor3 ref1=new Constructor3();
		//Constructor3 ref2=new Constructor3();
		Constructor3 ref3=new Constructor3(100);
		System.out.println("Stop");
	}
}
/*
Start
Inside the 0 arg Constructor..
Inside the 1 arg Constructor..
Stop
*/