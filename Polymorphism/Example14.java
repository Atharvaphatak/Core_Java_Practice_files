//Runtime Polymorphism
//example2 based on rule no.3
//rule no.3b: It is possible to override if the parent method return type 
//as well as child method return type is different at class level. 
class Sample
{	
	Sample m1()
	{	System.out.println("Inside m1 Method-Sample ref");
		return new Sample();
	}
}
class Demo extends Sample
{	
	Demo m1()
	{	System.out.println("Inside m1 Method-Demo ref");
		return new Demo();
	}
}
class Example14
{	public static void main(String args[])
	{	
		Demo d=new Demo();
		d.m1();
	}
}
//o/p--> Inside m1 Method-Demo ref


