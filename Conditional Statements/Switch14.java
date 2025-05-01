class Switch14
{
public static void main(String[] args)
{
	char c1='a';
	switch(c1)
	{ 
	case "cyber":System.out.println("Statement One");
				 break;
	case "success":System.out.println("Statement Two");
				   break;
	default :System.out.println("Statement Default..");
		     break;
	}
}
}
//error
/*Switch14.java:8: error: incompatible types: String cannot be converted to char
        case "cyber":System.out.println("Statement One");
             ^
Switch14.java:10: error: incompatible types: String cannot be converted to char
        case "success":System.out.println("Statement Two");*/
	
	
	
	
