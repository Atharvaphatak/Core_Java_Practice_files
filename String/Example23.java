class Example23
{
	public static void main(String args[])
	{
		char [] c=new char[3];
		c[0]='A';
		c[1]='B';
		c[2]='C';
		System.out.println(c.length);
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		for (int i=0;i<=2 ;i++)
		{
			System.out.println(c[i]);
		}
	}
}
/*
	3
	A
	B
	C
	A
	B
	C
*/