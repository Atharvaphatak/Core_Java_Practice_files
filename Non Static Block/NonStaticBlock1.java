class NonStaticBlock1
{
	{
		System.out.println("Inside Non Static Block..");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		NonStaticBlock1 b1=new NonStaticBlock1();
		System.out.println("Stop");
	}
}
/*
Start
Inside Non Static Block..
Stop
*/
	