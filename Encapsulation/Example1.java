class Demo
{	private int a;
	public void setval(int a)
	{	System.out.println("Setting the value of a");
		this.a=a;
	}
	public int getvalue()
	{	return this.a;
	}
}
class Example1
{	public static void main(String args[])
	{	Demo d=new Demo();
		d.setval(100);
		int currentval=d.getvalue();
		System.out.println("Value of a is:"+currentval);
	}
}