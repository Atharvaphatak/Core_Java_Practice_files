package cyber.success;

class Sample
{
	public static void main(String args[])
	{
		System.out.println("Inside the sample - main");
	}
}
class Demo
{
}
class Example4
{
}
/*
D:\JAVA PRO\Packages>javac -d . Example4.java

D:\JAVA PRO\Packages>java cyber.success.Sample
Inside the sample - main

D:\JAVA PRO\Packages>java cyber.success.Demo
Error: Main method not found in class cyber.success.Demo, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/
