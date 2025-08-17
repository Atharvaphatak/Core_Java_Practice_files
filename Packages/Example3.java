package training;

class Sample
{
	public static void main(String args[])
	{
		System.out.println("Inside the sample class");
	}
}
class Demo
{
	public static void main(String args[])
	{
		System.out.println("Inside the Demo class");
	}
}
class Example3
{
	public static void main(String args[])
	{
		System.out.println("Inside the Example8 class");
	}
}
/*
D:\JAVA PRO\Packages>javac -d . Example3.java

D:\JAVA PRO\Packages>java training.Sample
Inside the sample class

D:\JAVA PRO\Packages>java training.Demo
Inside the Demo class

D:\JAVA PRO\Packages>java training.Example3
Inside the Example8 class
*/
