//Practical Example of Abstraction..
abstract class Boa
{	abstract void Banking();
	abstract void Insurance();		//highlighting services but hiding implementsor logics..
	abstract void Finance();
} 
abstract class BoaBanking extends Boa
{	void Banking()
	{	System.out.println("Logics to implement Bank Req..");
	}
}
abstract class BoaInsurance extends BoaBanking
{	void Insurance()
	{	System.out.println("Logics to implement Insurance Req..");
	}
}
class BoaFinance extends BoaInsurance
{	void Finance()
	{	System.out.println("Logics to implement Finance Req..");
	}
}
class Example7
{	public static void main(String args[])
	{	System.out.println("Start");
		BoaFinance boa=new BoaFinance();
		boa.Banking();
		boa.Insurance();
		boa.Finance();
		System.out.println("Stop");
	}
}
/*
	Start
	Logics to implement Bank Req..
	Logics to implement Insurance Req..
	Logics to implement Finance Req..
	Stop
*/

