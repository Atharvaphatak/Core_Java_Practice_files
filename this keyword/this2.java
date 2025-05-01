class this2
{	int x;
	float y;
	void m1(int x,float y)
	{	System.out.println("Inside M1 Method");
		System.out.println(x+y);
		this.x=x;
		this.y=y;
	}
	void m2()
	{	System.out.println("Inside M2 Method");
		System.out.println(x+y);//non-static
	}
	public static void main(String args[])
	{	this2 t2=new this2();
		t2.m1(10,20.5f);
		t2.m2();
	}
}
/*
Inside M1 Method
30.5
Inside M2 Method
30.5
*/
