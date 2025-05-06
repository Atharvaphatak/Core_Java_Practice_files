interface It1
{	abstract static void m1();		//public and abstract
}
class Example20
{	public static void main(String args[])
	{	System.out.println("Start");
		
		System.out.println("Stop");
	}
}
/*  error: illegal combination of modifiers: abstract and static
{       abstract static void m1();              //public and abstract
                             ^
1 error
*/