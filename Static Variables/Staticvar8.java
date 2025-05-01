class Demo
{ static int a=400;
}
class Sample
{ static float result;
}
class Staticvar8
{  static float b=100.6f;
	public static void main(String args[])
	{
		Sample.result=Demo.a+b;
		System.out.println("The result is:"+Sample.result);
	}
}
//o/p-->500.6
