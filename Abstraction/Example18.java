interface Boa
{	abstract void banking();		//public and Abstract
	abstract void insurance();
	abstract void finance();
}
abstract class BoaFinance implements Boa
{	public void finance()
	{	System.out.println("logics for finance");
	}
}
abstract class BoaInsurance extends BoaFinance
{	public void insurance()
	{	System.out.println("logics for insurance");03-05-2025
	}
}
class BoaBanking extends BoaInsurance
{	public void banking()
	{	System.out.println("logics for banking");
	}
}
class Example18 extends BoaBanking
{	public static void main(String args[])
	{	System.out.println("Start");
		BoaBanking ref=new BoaBanking();
		ref.finance();
		ref.insurance();
		ref.banking();
		System.out.println("Stop");
	}
}
/*
	Start
	logics for finance
	logics for insurance
	logics for banking
	Stop
*/

