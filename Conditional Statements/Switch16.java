class Switch16
{
public static void main(String[] args)
{
	byte b1=127;
	switch(b1)
	{ 
	case 126:System.out.println("Statement 126");
			 break;
	case 127:System.out.println("Statement 127");
			 break;
	case 128:System.out.println("Statement 128");
			 break;
	default :System.out.println("Statement Default..");
		     break;
	}
}
}
//o/p-->error based on type of switch arg, the case label should be within the same range.
	
	
