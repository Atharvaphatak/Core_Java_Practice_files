class NonStaticBlock6
{	int a;//0
	{
		System.out.println("Inside Non Static Block.."+a);//0
		a=100;
	}
	public static void main(String args[])
	{	System.out.println("Start");
		NonStaticBlock6 b1=new NonStaticBlock6();
		System.out.println(b1.a);//100
		System.out.println("Stop");
	}
}
/*
Start
Inside Non Static Block..0
100
Stop
*/
	