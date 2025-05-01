class Constructor2
{	Constructor2()
	{	System.out.println("Inside the 0 arg Constructor..");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Constructor2 refvar1=new Constructor2();
		Constructor2 refvar2=new Constructor2();
		Constructor2 refvar3=new Constructor2();
		System.out.println("Stop");
	}
}
/*
Start
Inside the 0 arg Constructor..
Inside the 0 arg Constructor..
Inside the 0 arg Constructor..
Stop
*/