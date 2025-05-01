class Staticmethod5
{
	public static void main(String args[])
	{	int a=100;
		System.out.println("Inside the main method"+a);
		m1(a);
	}
	static void m1(int x)
	{
		System.out.println("Inside The M1 Method.."+x);
		return;
	}
	
}

