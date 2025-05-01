class NonStaticBlock4
{	
	{
		System.out.println("Inside Non Static Block..");//---------------------------2,4
	}
	NonStaticBlock4()
	{
		System.out.println("Inside Constructor 1");//---------------------------------3
	}
	NonStaticBlock4(int a)
	{
		System.out.println("Inside Constructor 2");//-------------------------------5
	}
	public static void main(String args[])
	{	System.out.println("Start");//------------------------1 line.
		NonStaticBlock4 ref1=new NonStaticBlock4();
		NonStaticBlock4 ref2=new NonStaticBlock4(500);
		System.out.println("Stop");//----------------------------6
	}
}
/*
Start
Inside Non Static Block..
Inside Constructor 1
Inside Non Static Block..
Inside Constructor 2
Stop
*/
	