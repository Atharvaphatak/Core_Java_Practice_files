class Nonprimitivevar6
{	char x='a';
	void test1()
	{	System.out.println("Inside test1 Method"+x);
	}
	static Nonprimitivevar6 ref;
	public static void main(String args[])
	{	System.out.println("Start");
		//object-->ref
		ref=new Nonprimitivevar6();
		//ref-->test1
		ref.test1();
		System.out.println("Stop");
	}	
}
/*
Start
Inside test1 Methoda
Stop
*/
