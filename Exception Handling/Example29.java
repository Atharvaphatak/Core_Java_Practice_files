class Example29
{
	void test3() throws InterruptedException
	{	System.out.println("Inside Test3");
		Thread.sleep(3000);
	}
	void test2() throws InterruptedException
	{	System.out.println("Inside Test2");
		test3();
	}
	void test1() throws InterruptedException
	{	System.out.println("Inside Test1");
		test2();
	}
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("Start");
		Example29 ref=new Example29();
		ref.test1();
		System.out.println("Stop");
	}
}
/*
Start
Inside Test1
Inside Test2
Inside Test3
Stop
*/
		
