class NonStaticBlock2
{
	{
		System.out.println("Inside Non Static Block..>> One");
	}
	{
		System.out.println("Inside Non Static Block..>> Two");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		NonStaticBlock2 b2=new NonStaticBlock2();
		System.out.println("Stop");
	}
}
/*
Start
Inside Non Static Block..>> One
Inside Non Static Block..>> Two
Stop
*/
	