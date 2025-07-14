// Convert into StringBuffer to String
// There are two approaches to convert string buffer to string 
// 1.Constructor based approach 
// 2.Using toString method() 
class Example12
{
	public static void main(String args[])
	{	// 1 Approach--> Constructor based Approach..
		StringBuffer sb1=new StringBuffer("Cyber");
		String str1=new String(sb1);
		System.out.println(str1);
		//str1.reverse();
		
		//2 Approach--> using toString() Method
		StringBuffer sb2=new StringBuffer("Success");
		String str2=sb2.toString();
		System.out.println(str2);
		//str2.reverse();
	}
}
/*
	Cyber
	Success
*/
