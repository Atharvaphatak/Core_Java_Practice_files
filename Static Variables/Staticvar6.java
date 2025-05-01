class Demo
{ static char c='a';
}
class Staticvar6
{ 
	public static void main(String args[])
	{
		//System.out.println(c);//directly-->invalid
		System.out.println(Demo.c);//classname-->valid
	}
}
//o/p-->a
