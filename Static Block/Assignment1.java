class Assignment1
{	static
	{	Assignment1 ref1=new Assignment1();
	}
	{	System.out.println("Inside Non Static Block..");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		System.out.println("Stop");
	}
}
/*
Inside Non Static Block..
Start
Stop
*/