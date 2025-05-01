class Demo
{
	{	
		System.out.println("Inside The Non-Static Block- Demo");
	}
	/*Demo()
	{	
	}	Super();
	*/
}
class Sample extends Demo
{
	{
		System.out.println("Inside The Non-Static Block- Samle");
	}
	/*sample()
	{	super();
	}*/
}
class Example22
{	public static void main(String[] args)
	{	System.out.println("Start");
		Sample ss=new Sample();
		System.out.println("Stop");
    }
}
/*o/P-->>
Start
Inside The Non-Static Block-Demo
Inside The Non-Static Block-Samle
Stop
*/