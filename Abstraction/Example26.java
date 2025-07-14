interface It1
{	static int a=100;   //public static + final
}
class Example26
{	
	public static void main(String args[])
	{	System.out.println("Start");
		System.out.println(It1.a);
		System.out.println("Stop");
	}
}