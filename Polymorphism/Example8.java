//Practical example on constructor overloading 
class Hdfc
{
	Hdfc(String CustName,int CustMobile)
	{
		System.out.println("Opening Your Saving Account..");
	}
	Hdfc(String CustName,int CustMobile, String CustCompany)
	{
		System.out.println("Opening Your Current Account..");
	}
}
class Example8
{	public static void main(String args[])
	{
	System.out.println("Start");
	Hdfc cust1=new Hdfc("Atharva",1234,"Google");
	System.out.println("Stop");
	}
}
/*
Start
Opening Your Current Account..
Stop
*/	