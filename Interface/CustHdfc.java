interface HdfcBankAccount
{	void bankAcc();
}
interface HdfcBankLoans
{	void bankLoan();
}
class IdProof
{	void idProof()
	{	System.out.println("Logics to connect to Addhar/ Verify..");
	}
}
class CustHdfc extends IdProof implements HdfcBankAccount, HdfcBankLoans
{	public void bankAcc()
	{	System.out.println("Logics to Open Savings Bank Account");
	}
	public void bankLoan()
	{	System.out.println("Logics to Apply for Personal Loan");
	}
	public static void main(String argd[])
	{
		System.out.println("Start");
		CustHdfc cust1=new CustHdfc();
		cust1.idProof();
		cust1.bankAcc();
		cust1.bankLoan();
		System.out.println("Stop");
	}
}
/*
	Start
	Logics to connect to Addhar/ Verify..
	Logics to Open Savings Bank Account
	Logics to Apply for Personal Loan
	Stop
*/