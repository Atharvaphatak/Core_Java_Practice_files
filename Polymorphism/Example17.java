class Parent
{	int a=10;
}
class Child extends Parent
{	float b=200.5f;
} 
class Example17
{	public static void main(String args[])
	{	System.out.println("Start");
		//Upcasting
		Parent p=new Child();
		System.out.println(p.a);
	    //System.out.println(p.b);
		System.out.println("--------------------------");
		
		//Downcasting
		Child c=(Child)p;
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println("Stop");
	}
}
/*
	Start
	10
	--------------------------
	10
	200.5
	Stop
*/

