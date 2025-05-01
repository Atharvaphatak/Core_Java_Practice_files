class System1
{	static System1 out1;
	void println1(String message)
	{	System.out.println(message);
	}
}
class Nonprimitivevar10
{	public static void main(String args[])
	{	System.out.println("Start");
		//onject-->ou-->pr
		System1.out1=new System1();
		System1.out1.println1("Inside pr method message");
		System.out.println("Stop");
	}
}
/*
Start
Inside pr method message
Stop
*/
