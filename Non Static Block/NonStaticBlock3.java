class NonStaticBlock3
{
	NonStaticBlock3()
	{
		System.out.println("Inside Constructor..");
	}
	{
		System.out.println("Inside Non Static Block..");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		NonStaticBlock3 ref=new NonStaticBlock3();
		System.out.println("Stop");
	}
}
/*
Start
Inside Non Static Block..
Inside Constructor..
Stop
*/
	