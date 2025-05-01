class Nonprimitivevar11
{	int a=100;
	Nonprimitivevar11 ref;
	public static void main(String args[])
	{	System.out.println("Start");
		Nonprimitivevar11 retval=new Nonprimitivevar11();
		System.out.println(retval.ref);
		retval.ref=new Nonprimitivevar11();
		System.out.println(retval.ref.a);
		//ref-->a
		System.out.println("Stop");
	}	
}
/*
Start
null
100
Stop
*/
