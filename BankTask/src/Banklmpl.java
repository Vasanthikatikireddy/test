import java.util.Scanner;
public  class Banklmpl implements Ibank {
		String Name,AccType,Accno,Address;
		long Amount,Balence;
		long WithDrawl;
		String Search;
	Scanner s = new Scanner(System.in);
	public void openAccount()
	{
		
		System.out.print("Enter Name :");
		Name=s.next();
	    System.out.print("Enter AccType :");
		AccType=s.next();
		System.out.print("Enter Accno :");
		Accno=s.next();
		System.out.print("Enter Address :");
		Address=s.next();
		System.out.print("Enter Balence :");
		Balence=s.nextLong();
		
	}
	public void showAccount()
	{
		System.out.println("Name :"+Name);
		System.out.println("AccType :"+AccType);
		System.out.println("Accno :"+Accno);
		System.out.println("Address :"+Address);
		System.out.println("Balence :"+Balence);
		
	}
	 public void deposit()
	{
		    System.out.println("Enter Amount to Deposit :");
			Amount = s.nextLong();
			Balence = Balence + Amount;
			System.out.println("Amount :" +Balence);
	}
	 
	public void withDrawl() {
		System.out.println("Enter amount to withdrawl :");
		Amount = s.nextLong();
		if(Balence >= Amount)
		{
		      Balence = Balence - Amount;
		      //Amount=Amount-WithDrawl;
		      System.out.println("After withdrawl :"+Balence);
		}
		
		else 
	       {
		       System.out.println("Amount exceeded " +WithDrawl+ "\n Transaction Failed");
				
		     }
		}
	
	public boolean search(String Account_no) {
		if(Accno.equals(Account_no)) 
		{
			showAccount();
			//System.out.println("Found");
			return (true);
			
		}
	
		    return (false);
		}
	}
		 

