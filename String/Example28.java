//String Tokenizer
import java.util.StringTokenizer;
class Example28
{
	public static void main(String args[])
	{
		System.out.println("Start");
		String str="This is an Example on String Tokenizer";
		StringTokenizer st1=new StringTokenizer(str);
		while (st1.hasMoreElements())
		{
			//object obj1=st1.nextElement();
			//String ss=(String)obj1;
			//System.out.println(ss);
			System.out.println((String)st1.nextElement());
		}
		System.out.println("Stop");	
	}
}
// public ava.util.StringTokenizer(String);
// public boolean hasMoreElement();
// public java.lang.Object nextElement();
/*
	Start
	This
	is
	an
	Example
	on
	String
	Tokenizer
	Stop
*/