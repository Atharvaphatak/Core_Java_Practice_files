class Example22
{
	public static void main(String args[])
	{
		int [] a=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println(a.length);//String class length() is method but in array length is variable
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		for (int i=0;i<=2 ;i++)
		{
			System.out.println(a[i]);
		}
	}
}
/*
	3
	10
	20
	30
	10
	20
	30
*/