class Demo
{	int a=100;
	void test1()
	{
	System.out.println("Inside the Test1 Method..");
	System.out.println(a);
	}
	
}
class Example5
{	System.out.println("Start");
	System.out.println("Inside The Test1 Method..");
	Demo d1=new Demo();
	d1.test1();
	System.out.println("Stop");
}