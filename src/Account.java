import java.util.Scanner;
class BankAccount{
	int acNo;
	String acName,acPhone,acEmail;
	double AcBal;
	public BankAccount(int acNo,String acName,String acPhone,String acEmail,double AcBal)
	{
		this.acNo=acNo;
		this.acName=acName;
		this.acPhone=acPhone;
		this.acEmail=acEmail;
		this.AcBal=AcBal;
	
	}
	public void accountholder()
	{
		System.out.println("Account Number:"+acNo);
		System.out.println("Account Holder Name:"+acName);
		System.out.println("Account Holder Address:"+acEmail);
		System.out.println("Account Holder Phone:"+acPhone);
		System.out.println("Account Holder Balance:"+AcBal);
		
		
		
	}
	public void deposit(double amount)
	{
		AcBal+=amount;
		System.out.println("Deposited: $"+amount);
	}
	public void displaybalance()
	{
		System.out.println("Account Number:" +acNo +" " +"Balance : $"+AcBal);
	}
}
	class SavingsAccount extends BankAccount{
	
		public SavingsAccount(int acNo,String acName,String acPhone,String acEmail,double AcBal){
		super(acNo,acName,acPhone,acEmail,AcBal);
	}
	}
	class CurrentAccount extends BankAccount{
		public CurrentAccount(int acNo,String acName,String acPhone,String acEmail,double AcBal) {
			super(acNo,acName,acPhone,acEmail,AcBal);
		}
		
	}
	

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner current = new Scanner(System.in);

		System.out.println("SAVINGS ACCOUNT DETAILS");
		SavingsAccount sac=new SavingsAccount(1001,"Ann Kamau","0720000000","test@gmail.com",1000);
		sac.accountholder();
		sac.deposit(500);
		sac.displaybalance();
		System.out.println("");
		
		CurrentAccount caa=new CurrentAccount(1001,"Peter Kamau","0810000000","admin@gmail.com",0);
		System.out.println("Enter the amount to deposit: ");
		double da=current.nextDouble();
		System.out.println("CURRENT ACCOUNT DETAILS");
		
		caa.accountholder();
		caa.deposit(da);
		caa.displaybalance();
		
		
		
		

	}

}
