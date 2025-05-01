class Staticmethod7
{
	public static void main(String args[])
	{
		int num1=100;
		float num2=200.6f;
		float result=add(num1,num2);
		System.out.println("The Result is:"+result);
	}
	static float add(int x, float y)
	{
		System.out.println("Inside Add Method..");
		float result=x+y;
		return result;
	}
}

		