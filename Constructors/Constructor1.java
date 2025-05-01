class Constructor1
{	Constructor1()
	{	System.out.println("Inside the 0 arg Constructor..");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Constructor1 refvar1=new Constructor1();
		System.out.println("Stop");
	}
}
/*
Start
Inside the 0 arg Constructor..
Stop
*/