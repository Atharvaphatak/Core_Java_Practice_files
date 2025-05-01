class MethodsExample2
{	char a='x';
	static boolean b=true;
	public static void main(String args[])
	{
		System.out.println("Start");
		MethodsExample2 ex1 =new MethodsExample2();
		ex1.test1();
		System.out.println("Stop");
			
	}
	static void test1()
	{	
		System.out.println("inside test1");
		MethodsExample2 ex2 =new MethodsExample2();
		System.out.println(ex2.a);
		System.out.println(b);
	}
}
