class Demo
{ static int a=100;
}
class Sample
{ static float b=100.6f;
}
class Staticvar7
{  
	public static void main(String args[])
	{
		float result;//local var
		result=Demo.a+Sample.b;
		System.out.println("The result is:"+result);
	}
}
//o/p-->200.6
