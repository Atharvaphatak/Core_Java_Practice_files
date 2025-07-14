
// W.A.J.P to check if a given string is palindrome or not
class Example30
{
	public static void main(String args[])
	{
		String original = "eye";
		StringBuffer strBuffer = new StringBuffer(original);
		String reversed = strBuffer.reverse().toString();

		System.out.println("Reversed: " + reversed);

		if(original.equals(reversed))
		{
			System.out.println("The given String is a Palindrome.");
		}
		else
		{
			System.out.println("The given String is not a Palindrome.");
		}
	}
}
