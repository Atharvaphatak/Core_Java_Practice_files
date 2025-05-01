class Cyber
{	float m1(int a,float b)
	{	System.out.println("Inside M1 Method");
		float result=a+b;
		return result;
	}	
}
class Nonstaticvar8
{	int a=200;
	public static void main(String args[])
	{	System.out.println("Start");
		int a=10;
		float b=20.5f;
		Cyber var1=new Cyber();
		float result=var1.m1(a,b);
		System.out.println(result);
		System.out.println("Stop");
	}
}