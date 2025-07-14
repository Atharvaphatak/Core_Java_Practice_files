//String Tokenizer
import java.util.StringTokenizer;
class Example29
{
	public static void main(String args[])
	{
		System.out.println("Start");
		String str="Split the,String based,on custom,delimiter";
		StringTokenizer st1=new StringTokenizer(str, ",");
		while (st1.hasMoreElements())
		{
			System.out.println((String)st1.nextElement());
		}
		System.out.println("Stop");	
	}
}
// public ava.util.StringTokenizer(java.lang.String, java.lang.String);
//						-- String to be split, delemiter/basis to split the string
/* o/p-->
	Start
	Split the
	String based
	on custom
	delimiter
	Stop
*/