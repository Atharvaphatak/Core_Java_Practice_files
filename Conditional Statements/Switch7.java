class Switch7
{
public static void main(String[] args)
{
	int a=1;
	switch(a)
	{ 
	case 1: System.out.println("Statement One"); //error-->duplicate caselabels are not allowed 
	break;
	case 1: System.out.println("Statement Two");
	break;
	case 3: System.out.println("Statement Three");
	break;
	default : System.out.println("Statement Default..");
	break;
	}
}
}

	
	
	
	
