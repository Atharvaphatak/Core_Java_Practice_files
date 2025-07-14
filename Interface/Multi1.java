interface It1
{	void m1();
}
interface It2 extends It1
{	void m2();
}
class Multi1 implements It2
{	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public void m2()
	{
		System.out.println("Inside m2 method");
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Multi1 ref1=new Multi1();
		ref1.m1();
		ref1.m2();
		System.out.println("Stop");
	}		
}
/*
	Start
	Inside m1 method
	Inside m2 method
	Stop
*/