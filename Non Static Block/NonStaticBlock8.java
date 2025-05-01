class NonStaticBlock8
{	int a;
	{
		System.out.println("Inside Non Static Block.. "+a);
		a=10;
	}
	NonStaticBlock8()
	{
		System.out.println("Before 0 Arg Constructor "+a);
		a=100;
		System.out.println("After 0 Arg Constructor "+a);
	}
	NonStaticBlock8(boolean x)
	{
		System.out.println("After 1 Arg Constructor "+a);
		a=1000;
		System.out.println("Before 1 Arg Constructor "+a);
	}
	public static void main(String args[])
	{	System.out.println("Start");
		NonStaticBlock8 ref1=new NonStaticBlock8();
		NonStaticBlock8 ref2=new NonStaticBlock8(true);
		System.out.println("Stop");
	}
}
/*
Start
Inside Non Static Block.. 0
Before 0 Arg Constructor 10
After 0 Arg Constructor 100
Inside Non Static Block.. 0
After 1 Arg Constructor 10
Before 1 Arg Constructor 1000
Stop
*/
	