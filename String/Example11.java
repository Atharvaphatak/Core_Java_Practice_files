// convert into String to StringBuffer
class Example11
{
	public static void main(String args[])
	{	// 1 Approach
		String str1="Cyber";
		StringBuffer sb1=new StringBuffer(str1);
		System.out.println(sb1);
		StringBuffer sb2=sb1.reverse();
		System.out.println(sb2);
	}
}
/*
	Cyber
	rebyC
*/
