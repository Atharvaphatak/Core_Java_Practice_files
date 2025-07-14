class Example2
{
	public static void main(String args[])
	{
		System.out.println("start");
		int [] a={10,20,30};
		System.out.println(a[1]);
		System.out.println(a[10]);
		System.out.println("stop");
	}
}
/*
start
20
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
        at Example2.main(Example2.java:8)
*/