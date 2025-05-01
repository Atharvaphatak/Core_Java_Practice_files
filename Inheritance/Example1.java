class Parent
{
	int a=10;
}
class Child extends Parent
{	
	float b=200.5f;
}
class Example1
{	
	public static void main(String args[])
	{	
		Parent p=new Parent();
		System.out.println(p.a);
		//System.out.println(p.b);
		Child c=new Child();
		System.out.println(c.a);
		System.out.println(c.b);	
	}
}
/*
10
10
200.5
*/