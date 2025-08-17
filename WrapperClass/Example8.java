import java.util.*;
class Example8
{
	public static void main(String args[])
	{
		String num1="100";
		String num2="200";
		//String--> Wrapper Object
		Integer i1=new Integer(num1);
		Integer i2=new Integer(num2);
		System.out.println(i1+i2);
		//String--> Primitive 
		int var1=Integer.parseInt(num1);
		int var2=Integer.parseInt(num2);
		System.out.println(var1+var2);
	}	
}
/* output

300
300
*/
//Integer class
//public static int parseInt(Java.lang.String) throws java.lang.NumberFormatException;
//float class
//public static float parseInt(java.lang.String) throws java.lang.NumberFormatException
//parsexxxxx()-> String--> Primitive