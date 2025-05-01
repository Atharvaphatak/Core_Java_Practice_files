class Sample
{	int a=400;//nonstatic var
	void m1()//nonstatic method
	{	System.out.println("Inside The M1 Method..");
	}
}
class Combo4
{	public static void main(String args[])
	{
		System.out.println("Start");
		
		// 1 Approach--> Object
		Sample S1=new Sample();
		System.out.println(S1.a);
		S1.m1();
		
		System.out.println("Stop");
	}	
}	
