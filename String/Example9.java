//We cannot create objects of stringBuffer class without new keyword.
//We can create objects of stringBuffer class only by using new keyword.
class Example9
{
	public static void main(String args[])
	{
		//StringBuffer sb1="Atharva";		//invalid obj creation
		StringBuffer sb2=new StringBuffer("Atharva");	//valid obj creation
		System.out.println(sb2);
	}	
}
//o/p--> Atharva