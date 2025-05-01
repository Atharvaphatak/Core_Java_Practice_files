class Constructor5
{	public static void main(String args[])
	{	System.out.println("Start");
		Constructor5 refvar1=new Constructor5();
		System.out.println("Stop");
	}
	void m1()
	{
	}
	static void m2()
	{
	}
}
/*
D:\JAVA PRO\Constructors>javac Constructor5.java

D:\JAVA PRO\Constructors>javap Constructor5
Compiled from "Constructor5.java"
class Constructor5 {
  Constructor5();
  public static void main(java.lang.String[]);
  void m1();
  static void m2();
}

D:\JAVA PRO\Constructors>java Constructor5
Start
Stop

*/