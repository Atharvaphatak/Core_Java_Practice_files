class Sample
{	Sample()
	{	System.out.println("Inside Sample..");
		Sample s1=new Sample();
	}
}
class Assignment5
{
	public static void main(String args[])
	{	System.out.println("Start");
		Sample s1=new Sample();
		System.out.println("Stop");
	}
}
/*

*/
