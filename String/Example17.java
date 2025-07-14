class Example17
{
	public static void main(String args[])
	{	
		String str=" Cyber ";
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		String str1="";
		System.out.println(str1.isEmpty());
		String str2=" Eye ";
		System.out.println(str2.length());
		String str3=str2.trim();
		System.out.println(str3);
		System.out.println(str3.length());
		String str4="how are";
		System.out.println(str4.length());
		String str5=str4.trim();
		System.out.println(str5.length());
	}
}
/*
	7
	false
	true
	5
	Eye
	3
	7
	7	
*/