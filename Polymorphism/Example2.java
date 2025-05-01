////this example satisfy rule no2
class Example2
{	void m1(int a)
	{
		System.out.println("Inside M1 Method--Int ARG");
	}
	void m1(float b)
	{
		System.out.println("Inside M1 Method--Float ARG");
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		Example2 ex1=new Example2();
		ex1.m1(10.5f);
		System.out.println("Stop");
	}
}
/*
Start
Inside M1 Method--Float ARG
Stop
*/