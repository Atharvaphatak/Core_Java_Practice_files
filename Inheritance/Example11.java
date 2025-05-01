class Example11
{	public static void main(String args[])
	{	System.out.println("Start");
		Example11 e=new Example11();
		System.out.println(e);//print address--> Implicit
		System.out.println(e.toString());//print address--> Explicit
		System.out.println("Stop");
	}
}
/*
Start
Example11@2f92e0f4     ---->this code called as "Hash Codes"--->hash codes always in hexadecimal format
Example11@2f92e0f4
Stop
*/