////this example satisfy both the rule 1&2
class Example3
{	void m1(int a)
	{
		System.out.println("Inside M1 Method--Int ARG");
	}
	void m1()
	{
		System.out.println("Inside M1 Method--0 ARG");
	}
	void m1(float b)
	{
		System.out.println("Inside M1 Method--Float ARG");
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Example3 ex2=new Example3();
		ex2.m1();
		System.out.println("Stop");
	}
}
/*
Start
Inside M1 Method--0 ARG
Stop
*/