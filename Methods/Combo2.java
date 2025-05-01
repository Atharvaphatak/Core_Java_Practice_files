class Demo
{	static int a=200;//static var
	static void m1()//static method
	{	System.out.println("Inside The M1 Method..");
	}
}
class Combo2
{	public static void main(String args[])
	{	System.out.println("Start");
		/
		/1 Approach--> Classname
		System.out.println(Demo.a);
		Demo.m1();
		
		// 2 Approach--> Object
		Demo d1=new Demo();
		System.out.println(d1.a);
		d1.m1();
		
		System.out.println("Stop");
	}	
}	
