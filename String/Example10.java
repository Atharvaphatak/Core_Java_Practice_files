class Example10
{
	public static void main(String args[])
	{	
		String str1="Cyber";
		System.out.println(str1);
		str1.concat("Success");
		System.out.println(str1);
		System.out.println("-------------------------");
		StringBuffer sb1=new StringBuffer("Training");
		System.out.println(sb1);
		sb1.append("Institute");
		System.out.println(sb1);
	}
}
/*
	Cyber
	Cyber
	-------------------------
	Training
	TrainingInstitute
*/