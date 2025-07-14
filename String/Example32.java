//IQ)(Nimap)--> W.A.J.P to display reverse of a name.
class Example32
{
	public static void main(String args[])
	{
		String str="Atharva Abhijeet Phatak";
		String [] s=str.split(" ");
		System.out.println(s.length); //3
		for (int i=s.length-1;i>=0 ; i--)
		{
			System.out.println(s[i]);
		}
	}
}
/*
	3
	Phatak
	Abhijeet
	Atharva
*/
