class Example31
{
	void test3() throws ArithmeticException
	{	System.out.println("Inside Test3");
		System.out.println(10/0);
	}
	void test2() throws ArithmeticException
	{	System.out.println("Inside Test2");
		test3();
	}
	void test1() 
	{	System.out.println("Inside Test1");
		test2();
	}
	public static void main(String args[]) 
	{
		System.out.println("Start");
		Example31 ref=new Example31();
		ref.test1();
		System.out.println("Stop");
	}
}
/*
Start
Inside Test1
Inside Test2
Inside Test3
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Example31.test3(Example31.java:5)
        at Example31.test2(Example31.java:9)
        at Example31.test1(Example31.java:13)
        at Example31.main(Example31.java:19)
*/
		
