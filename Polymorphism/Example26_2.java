//runtime polymorphism
//rule 5: 2)
class Demo
{	static void m1()
	{	System.out.println("Inside M1 Method-Demo");
	}
}
class Sample extends Demo
{	//static void m1()
	//{	System.out.println("Inside M1 Method-Sample");
	//}
}
class Example26_2
{	public static void main(String args[])
	{	System.out.println("Start");
		Demo d=new Sample();
		d.m1();
		System.out.println("Stop");
	}
}
/*
	Start
	Inside M1 Method-Demo
	Stop
*/
