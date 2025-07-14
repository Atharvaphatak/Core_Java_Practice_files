class Example25
{
	public static void main(String args[])
	{
		String str="This is an Example on Split Method";
		String [] s= str.split(" "); 
		System.out.println(s.length);
		for (int i=0;i<=s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}