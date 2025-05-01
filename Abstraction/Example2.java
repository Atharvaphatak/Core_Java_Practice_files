abstract class HdfcApp
{	
	abstract void transfer();
}
class HdfcServer extends HdfcApp
{	void transfer()
	{	
		System.out.println("Logics to transfer your money..");
	}
}
class Example2
{	public static void main(String args[])
	{	
		System.out.println("Start");
		HdfcServer cust1=new HdfcServer();  //its like inheritance..
		cust1.transfer();
		System.out.println("Stop");
	}
}
