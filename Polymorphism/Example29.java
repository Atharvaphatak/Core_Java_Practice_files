//Runtime polymorphism
//rule 7b: To achieve overriding it is possible to override from narrow access level 
//to wider access level.
class Demo
{	protected void m1()								//default access modifier
	{	System.out.println("Inside M1 Method- Demo");
	}
}
class Sample extends Demo
{	public void m1()								//protected access modifier
	{	System.out.println("Inside M1 Method- Sample");
	}
}
class Example29
{	public static void main(String args[])
	{	System.out.println("Start");
		Demo d=new Sample();
		d.m1();
		System.out.println("Stop");
	}
}
/*
	Start
	Inside M1 Method- Sample
	Stop
*/