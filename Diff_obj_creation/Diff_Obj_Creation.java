class Demo
{	int a=100;
	void m1()
	{
	System.out.println("Inside m1 Method");
	}
}
class Diff_Obj_Creation
{	static void test()
	{	System.out.println("Inside Test Method");
	//1 Approach
	Demo d=new Demo();
	System.out.println(d.a);
	d.m1();
	System.out.println("--------------------------------");
	//2 Approach
	System.out.println(new Demo().a);
	new Demo().m1();
	}
	public static void main(String args[])
	{	test();
	}
}
//o/p-->
/*Inside Test Method
100
Inside m1 Method
--------------------------------
100
Inside m1 Method
*/
