class Muldiv
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
class Staticmethod9
{
	public static void main(String args[])
	{	
		float result1=Muldiv.mul(10,20);//access static methods from another class so we use classname 
		float result2=Muldiv.div(10,20.5f);
		System.out.println("The Result1 is:"+result1);
		System.out.println("The Result2 is:"+result2);
	}
}
//o/p-->
//The Result1 is:200.0
//The Result2 is:0.4878049
	