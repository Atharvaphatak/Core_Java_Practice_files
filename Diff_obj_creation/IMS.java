//Business logic class
class CyberSuccess
{	int Studid;
	String Studname;
	static String Institutename="Cyber Success";
	void setStudInfo(int Studid,String Studname)
	{	this.Studid=Studid;
		this.Studname=Studname;
		System.out.println("Your Deatils have been Successfully saved @"+Institutename);
	}
	void getStudInfo()
	{	System.out.println("Studid is : "+Studid+"Studname is : "+Studname);
	}
	static  void attendance()
	{	//Service common to all..
	}
}
class IMS
{	public static void main(String args[])
	{	CyberSuccess stud1=new CyberSuccess();
		stud1.setStudInfo(101,"Atharva");
		stud1.getStudInfo();
		CyberSuccess stud2=new CyberSuccess();
		stud2.setStudInfo(201,"Ashish");
		stud2.getStudInfo();
	}
}
/*
Your Deatils have been Successfully saved @Cyber Success
Studid is: 101Studname is: Atharva
Your Deatils have been Successfully saved @Cyber Success
Studid is: 201Studname is: Ashish
*/