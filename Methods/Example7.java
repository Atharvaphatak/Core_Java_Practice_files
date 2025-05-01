class Demo
{	static int x=100;
	float y=200.5f;
}
class Sample
{	void m1(int a)
	{	System.out.println("inside m1");
		int result1=Demo.x+a;
		System.out.println("The Result1 is:"+result1);
	}
	static void m2(float b)
	{	System.out.println("inside m2");
		Demo d= new Demo(); 
		float result2=d.y+b;
		System.out.println("The Result2 is:"+result2);
	}
}
class Example7
{	public static void main(String args[])
	{	int a=10;
		float b=20.5f;
		Sample s1=new Sample();
		s1.m1(a);
		Sample.m2(b);
	}
}
/*o/p-->
inside m1
The Result1 is:110
inside m2
The Result2 is:221.0
*/

