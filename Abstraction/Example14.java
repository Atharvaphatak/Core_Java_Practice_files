abstract class Demo
{	static 
	{	System.out.println("Inside Static Block...1 ");
	}
}
class Example14 extends Demo
{	static 
	{	System.out.println("Inside Static Block... 2");
	}
	public static void main(String args[])
	{	System.out.println("Start");
		//Example13 ref=new Example13();
		System.out.println("Stop");
	}
}
/*
	Inside Static Block...1
	Inside Static Block... 2
	Start
	Stop
*/