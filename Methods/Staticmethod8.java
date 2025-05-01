class Staticmethod8
{
	public static void main(String args[])
	{	int num1=10;
		float num2=20.5f;
		float result1=muldiv.mul(num1,num2);//access static methods from another class so we use classname 
		float result2=muldiv.div(num1,num2);
		System.out.println("The Result1 is:"+result1);
		System.out.println("The Result2 is:"+result2);
	}
}
class muldiv
{
		static float mul(int x,float y)
		{	float result1=x*y;
			return result1;
		}
		static float div(int p,float q)
		{	float result2=p/q;
			return result2;
		}
}
	