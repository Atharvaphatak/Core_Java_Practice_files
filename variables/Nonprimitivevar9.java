class Sy
{	static Sy ou;
	void pr(String message)
	{	System.out.println(message);
	}
}
class Nonprimitivevar9
{	public static void main(String args[])
	{	System.out.println("Start");
		Sy.ou=new Sy();
		Sy.ou.pr("Inside pr method message");
		System.out.println("Stop");
	}
}
/*
Start
Inside pr method message
Stop
*/
