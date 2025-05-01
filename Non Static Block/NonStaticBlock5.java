class NonStaticBlock5
{	
	{
		System.out.println("Inside Non Static Block..");//---------------------------2
	}
	NonStaticBlock5()
	{	this(10.5f);
		System.out.println("Inside Constructor 1");//---------------------------------4
	}
	NonStaticBlock5(float b)
	{	System.out.println("Inside Constructor 2");//-------------------------------3
	}
	public static void main(String args[])
	{	System.out.println("Start");//--------------------------1
		NonStaticBlock5 refvar1=new NonStaticBlock5();
		System.out.println("Stop");//----------------------------5
	}
}
/*
Start
Inside Non Static Block..
Inside Constructor 2
Inside Constructor 1
Stop
*/
	