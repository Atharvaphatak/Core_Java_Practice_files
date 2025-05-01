class Constructor9
{	Constructor9()
	{	this(10);
		System.out.println("Inside 0 arg Constructor..");//------------------3
	}
	Constructor9(int a)
	{	System.out.println("Inside 1 arg Constructor..");//------------------2
	}
	public static void main(String args[])
	{	System.out.println("Start");//---------------------1line execute
		Constructor9 ref1=new Constructor9();
		System.out.println("Stop");//-------------------4
	}	
}
/*
Start
Inside 1 arg Constructor..
Inside 0 arg Constructor..
Stop
*/
