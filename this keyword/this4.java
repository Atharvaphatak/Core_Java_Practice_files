class this4
{	int a;
	static void test1 (int a) 
	{	System.out.println("Inside test1 method");
		this.a=a;
	}
	public static void main(String args[])
	{	this3 t3=new this3();
		t3.test1();
	}
}
/*
error becoz this keyword will only work with non static area...
*/
