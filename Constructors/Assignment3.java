class Assignment3
{	
	Assignment3()
	{	System.out.println("Inside Constructor..");
		m1();
	}
	void m1()
	{	System.out.println("Inside M1 Method..");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Assignment3 ref1=new Assignment3();
		System.out.println("Stop");
	}
}
//o/p-->
/*
Start
Inside Constructor..
Inside M1 Method..
Stop
*/
