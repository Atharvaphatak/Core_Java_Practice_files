package mobile.motorola;

class Sample
{
	public static void main(String args[])
	{
		System.out.println("Start");
		new Demo().camera();//using obj
		Example5.network();//using classname
		System.out.println("Stop");
	}	
}
class Demo
{
	void camera()
	{
		System.out.println("Inside the camera");
	}
}
class Example5
{
	static void network()
	{
		System.out.println("Inside network method");
	}
}
/*
Start
Inside the camera
Inside network method
Stop
*/

