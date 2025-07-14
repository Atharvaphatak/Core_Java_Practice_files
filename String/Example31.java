class Demo
{
	Demo(String str)
	{
	}
}
class Example31
{
	public static void main(String args[])
	{
		System.out.println("Start");
		Demo d=new Demo("Cyber");
		System.out.println(d);//address
		String str1=new String("Success");
		System.out.println(str1);//value
		System.out.println("Stop");
	}
}
/*
	Start
	Demo@28a418fc
	Success
	Stop
*/