class Forloop4
{
	public static void main(String[] args)
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(i);
			if (i==3)
			{
				System.out.println("The value of i is:"+i);
				break;
			}
		}
	}
}
