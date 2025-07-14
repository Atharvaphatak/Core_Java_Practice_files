class Example16
{	void m3()
	{	System.out.println("Inside m3 method");
		
		try
		{	System.out.println(10/0);	
		}
		catch (ArithmeticException ae)
		{	ae.printStackTrace();
		}
	}
	void m2()
	{	System.out.println("Inside m2 method");
		m3();
	}
	void m1()
	{	System.out.println("Inside m1 method");
		m2();
	}
	public static void main(String args[])
	{	System.out.println("Start");
		new Example16().m1();
		System.out.println("Stop");
	}
}
/*
	Start
	Inside m1 method
	Inside m2 method
	Inside m3 method
	java.lang.ArithmeticException: / by zero
			at Example16.m3(Example16.java:7)
			at Example16.m2(Example16.java:15)
			at Example16.m1(Example16.java:19)
			at Example16.main(Example16.java:24)
	Stop
*/