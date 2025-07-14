//Methods in String Class
//-charAt(),-concat(),-equals(),-startswith(),-endswith(),-contains()
//The string class inherits the methods from object class and overrides the equals() method 
//hence, this performs content comparison 
class Example13
{
	public static void main(String args[])
	{	//charAt():
		String str="Cyber";
		System.out.println(str.charAt(1));
		System.out.println("--------------------");
		//equals():
		String str1="Cyber";
		String str2="Success";
		String str3="Cyber";
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));
		System.out.println("--------------------");
		String s11=new String("Cyber");
		String s22=new String("Success");
		String s33=new String("Cyber");
		System.out.println(s11.equals(s22));
		System.out.println(s22.equals(s33));
		System.out.println(s33.equals(s11));	
	}
}
/*
	y
	--------------------
	false
	false
	true
	--------------------
	false
	false
	true
*/