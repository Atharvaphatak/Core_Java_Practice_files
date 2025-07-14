class Example26
{
	public static void main(String args[])
	{
		System.out.println("Start");
		String str1="CYBER", str2="Cyber";
		System.out.println(str1.equals(str2));// case sensitive comparison 
		System.out.println(str1.equalsIgnoreCase(str2));// case insensitive comparison 
		System.out.println(str1.compareTo(str2));// case sensitive comparison 
		System.out.println(str1.compareToIgnoreCase(str2));// case insensitive comparison 
		System.out.println("Stop");
	}
}
/*
	Start
	false
	true
	-32
	0
	Stop
*/
		
		
