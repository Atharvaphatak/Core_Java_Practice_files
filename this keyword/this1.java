class this1
{	int x=10;
	void m1(int x)
	{	System.out.println("Inside M1 Method");
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String args[])
	{	this1 t=new this1();
		System.out.println(t.x);
		t.m1(100);
	}
}
/*
10
Inside M1 Method
100
10
*/
