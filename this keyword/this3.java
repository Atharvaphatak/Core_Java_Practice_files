class this3
{	int a;
	this3 test1 (int a) 
	{	System.out.println("Inside test1 method");
		this.a=a;
		System.out.println(this.a+a);
		return this;
	}
	public static void main(String args[])
	{	this3 t3=new this3();
		this3 retval=t3.test1(100);
		System.out.println(retval);
		System.out.println(t3);
	}
}
/*
Inside test1 method
200
this3@2f92e0f4----hash codes
this3@2f92e0f4--hash codes
*/
