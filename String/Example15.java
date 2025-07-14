class Example15
{
	public static void main(String args[])
	{	
		String str1="Atharva Phatak";
		System.out.println(str1.contains("Ph"));
		System.out.println(str1.startsWith("Ath"));
		System.out.println(str1.startsWith("at"));
		System.out.println(str1.endsWith("ak"));
		System.out.println(str1.endsWith("va"));	
	}
}
/*
	true
	true
	false
	true
	false
*/