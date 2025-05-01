class Constructor4
{	Constructor4()
	{	System.out.println("Inside the 0 arg Constructor..");
		return;
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Constructor4 refvar1=new Constructor4();
		System.out.println("Stop");
	}
}

/*
Start
Inside the 0 arg Constructor..
Stop

Note:if we do not write return stmt within the constructor then 
compiler will set the return stmt(bydefaultly..) 
*/