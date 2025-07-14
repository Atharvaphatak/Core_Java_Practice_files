class Example6
{	
	String info;
	Example6(String info)
	{
		this.info=info;
	}
	public String toString()
	{
		return info;
	}
	public static void main(String args[])
	{
		Example6 ref1=new Example6("Cyber Success Training");
		System.out.println(ref1);
		Example6 ref2=new Example6("Ai che maze skills");
		System.out.println(ref2);
	}
}
/*
	Cyber Success Training
	Ai che maze skills
*/