class Example16
{
	public static void main(String args[])
	{	
		String str="CyberSuccess";
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("x"));
		System.out.println(str.lastIndexOf("e"));
		System.out.println(str.lastIndexOf("z"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}
}
/*
	3
	-1
	9
	-1
	cybersuccess
	CYBERSUCCESS
*/