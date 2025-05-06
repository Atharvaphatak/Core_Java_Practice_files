interface Flipkart
{	void categories();		//public and Abstract 
	void addToCart();		//public and Abstract 
	void userProfile();		//public and Abstract 
}
//Adapter class..
class AdapterFlipkart implements Flipkart
{	public void categories()  {  }
	public void addToCart()	  {  }
	public void userProfile() {  }
}
class FlipkartAddToCart extends AdapterFlipkart
{	public void addToCart()
	{	System.out.println("Inside addToCart Fuction");
	}
}
class Example21
{	public static void main(String args[])
	{
		System.out.println("Start");
		FlipkartAddToCart fk=new FlipkartAddToCart();
		fk.addToCart();
		System.out.println("Stop");
	}
}
/*
	Start
	Inside addToCart Fuction
	Stop
*/