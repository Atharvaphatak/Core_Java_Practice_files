class Demo
{	int a=100;
	static float m1()
	{	System.out.println("Inside M1");
		Example8 ref=new Example8();
		float result1=Sample.b+ref.x;
		return result1;
	}
}
class Sample
{	static float b=200.5f;
	float m2()
	{	System.out.println("inside M2");
		Demo d=new Demo();
		Example8 ref1=new Example8();
		float result2=d.a+ref1.y;
		return result2;
	}
}
class Example8
{	int x=10;
	float y=20.5f;
	public static void main(String args[])
	{	System.out.println("Start");
		float result1=Demo.m1();
		Sample s=new Sample();
		float result2=s.m2();
		System.out.println(result1+result2);
		System.out.println("Stop");
	}
}
/*o/p-->
Start
Inside M1
inside M2
331.0
Stop
*/

