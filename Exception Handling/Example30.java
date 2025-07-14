import java.io.FileNotFoundException;
import java.io.FileInputStream;

class Example30
{
	void test3() throws InterruptedException , FileNotFoundException
	{	System.out.println("Inside Test3");
		Thread.sleep(3000);
		FileInputStream f= new FileInputStream("D.\\Demo.txt");
	}
	void test2() throws InterruptedException, FileNotFoundException
	{	System.out.println("Inside Test2");
		test3();
	}
	void test1() throws InterruptedException, FileNotFoundException
	{	System.out.println("Inside Test1");
		test2();
	}
	public static void main(String args[]) throws InterruptedException, FileNotFoundException
	{
		System.out.println("Start");
		Example30 ref=new Example30();
		ref.test1();
		System.out.println("Stop");
	}
}
/*
Start
Inside Test1
Inside Test2
Inside Test3
Exception in thread "main" java.io.FileNotFoundException: D.\Demo.txt (The system cannot find the path specified)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:106)
        at Example30.test3(Example30.java:8)
        at Example30.test2(Example30.java:12)
        at Example30.test1(Example30.java:16)
        at Example30.main(Example30.java:22)
*/
		
