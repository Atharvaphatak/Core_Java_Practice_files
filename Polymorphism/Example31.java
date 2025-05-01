//Runtime polymorphism
//Note: Variables are not part of overriding as they can have different behaviors. 
class Demo
{	int a=100;
}
class Sample extends Demo
{	int a=10;
}
class Example31
{	public static void main(String args[])
	{	System.out.println("Start");
		Demo d=new Sample();
		System.out.println(d.a);
		System.out.println("Stop");
	}
}
/*
	Start
	100
	Stop        
//not part of overriding
// Preference always given to parent class variables..
*/