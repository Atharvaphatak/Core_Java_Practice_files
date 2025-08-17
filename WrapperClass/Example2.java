import java.util.*;
class Example2
{
	public static void main(String[] args)
	{
		Integer i1=new Integer("abc");
		System.out.println(i1);
	}
}
/*Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:662)
        at java.base/java.lang.Integer.<init>(Integer.java:1119)
        at Example2.main(Example2.java:6)

*/