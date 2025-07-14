interface It1
{	int a=10;	//variable is allowed within an interface and by nature public static & final
}
class Example27 
{	public static void main(String args[])
	{	System.out.println("Start");
		System.out.println(It1.a);
		It1.a=100;
		System.out.println("Stop");
	}
}
/* error:
cannot assign a value to static final variable a
                It1.a=100;
*/