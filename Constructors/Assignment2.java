class Assignment2
{	Assignment2()
	{	Assignment2 at=new Assignment2();
	}
	public static void main(String args[])
	{	System.out.println("Start");
		Assignment2 at1 =new Assignment2();
		System.out.println("Stop");
	}
}
/*
Start
Exception in thread "main" java.lang.StackOverflowError
        at Assignment2.<init>(Assignment2.java:3)
        at Assignment2.<init>(Assignment2.java:3)
        at Assignment2.<init>(Assignment2.java:3)
        at Assignment2.<init>(Assignment2.java:3)
        at Assignment2.<init>(Assignment2.java:3)
        at Assignment2.<init>(Assignment2.java:3)
        at Assignment2.<init>(Assignment2.java:3)
        at Assignment2.<init>(Assignment2.java:3)
*/
