class staticmethod6
{
	public static void main(String args[])
	{
		float b=m1();
		System.out.println("Inside the main-- b value is:"+b);
	}
	static float m1()
	{
		System.out.println("Inside M1 Method..");
		float b=100.5f;
		return b;
	}
}
