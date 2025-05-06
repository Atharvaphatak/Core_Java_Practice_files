//Assignment 2
interface It1
{	
	/*It1()
	{	System.out.println("Inside the It1 constructor");
	}*/						//constructors are not part of interfaces 
	
	/*{	
		System.out.println("Inside Non Static block..");
	}*/						//non static block are also not part of interfaces
	
	//While static methods are allowed in interfaces from Java 8 onward, 
	//static blocks are technically not allowed in interfaces according to 
	//the Java Language Specification.
	//The Java compiler throws:
	//error: interface abstract methods cannot have body
	
	static void init()
	{	System.out.println("Inside Static block..");
	} //but static blocks are part of interfaces becoz they are not dependent on objects.
}
class Example17 implements It1
{	public static void main(String args[])
	{	System.out.println("Start");
		It1.init();	//// This simulates a static block behavior
		System.out.println("Stop");
	}
}
/*
	Start
	Inside Static block..
	Stop
*/