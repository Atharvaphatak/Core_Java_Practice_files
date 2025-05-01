class Constructor6
{	Constructor6(int a)
	{	System.out.println("Inside 1 arg Constructor..");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Constructor6 ref1=new Constructor6();
		Constructor6 ref2=new Constructor6(200);
		System.out.println("Stop");
	}
}
/*
o/p-->error
Note: if we create any constructor then the compiler never ever create 
default,0arg,empty implementation constructor..
*/