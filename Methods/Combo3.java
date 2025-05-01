class Combo3
{	int a=300;//nonstatic var
	void m1()//nonstatic method
	{	System.out.println("Inside The M1 Method..");
	}
	public static void main(String args[])
	{
		System.out.println("Start");
		
		// 1 Approach--> Object
		Combo3 c1=new Combo3();
		System.out.println(c1.a);
		c1.m1();
		
		System.out.println("Stop");
	}	
}	
