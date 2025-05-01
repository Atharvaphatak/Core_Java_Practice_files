class Demo
{
	Demo()
	{	System.out.println("Inside 0 arg Constructor..");
	}
}
class Assignment4
{	Assignment6(Demo d)
	{	
		System.out.println("Inside 1 arg Constructor..");
	}
	public static void main(String args[])
	{	Assignment4 ref1=new Assignment4(new Demo[]);
	}
}