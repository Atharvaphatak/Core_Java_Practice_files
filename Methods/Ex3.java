class Ex3
{	static int x=100;
	float y=200.5f;
	public static void main(String args[])
	{	System.out.println("Start");
		int z=200;
		Ex3 ref=new Ex3();
		float result=ref.test1(z);
		System.out.println(result);
		System.out.println("Stop");	
	}
	float test1(int z)
	{	System.out.println("Inside test1");
		float result=x+y+z;
		return result;
		
	}
	
	
}

