/*Weather an exception raised or not we cannot use independent try blocks */
class Example12
{	public static void main(String args[])
	{	System.out.println("start");
		int a[]={10,20,30,40,50};
		try
		{
			System.out.println("Inside try Block..");
			System.out.println(a[2]);	
		}
		System.out.println("stop");
	}
} 
/*
Example12.java:5: error: 'try' without 'catch', 'finally' or resource declarations
                try
                ^
1 error
*/