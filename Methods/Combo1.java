class Combo1
{	static int a=100;//static var
	static void m1()//static method
	{
		System.out.println("Inside The M1 Method..");
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		//1 Approach--> Directly
		System.out.println(a);
		m1();
		//2 Approach--> Classname
		System.out.println(Combo1.a);
		Combo1.m1();
		// 3 Approach--> Object
		Combo1 obj=new Combo1();
		System.out.println(obj.a);
		obj.m1();
		System.out.println("Stop");
	}	
}	
