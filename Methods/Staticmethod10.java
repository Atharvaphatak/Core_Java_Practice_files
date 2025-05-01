class Staticmethod10
{	static float b=200.5f;
	public static void main(String args[])
	{	System.out.println("Start");
		int a=100;//local var
		System.out.println("Inside the main method"+a);//directly
		System.out.println("Inside the main method"+b);//directly
		System.out.println(Staticmethod10.b);//classname
		System.out.println("Stop");
	}	
}
