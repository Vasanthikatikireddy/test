import java.util.Scanner;
public class Main {
	
public static void main(String[]args)
	
{
       Scanner s = new Scanner(System.in);  
		
        System.out.print("Enter number of Accounts: ");  
        int n = s.nextInt(); 
        System.out.println("Number of accounts selected are :"+n);
        Banklmpl banklmpl[] = new Banklmpl[n];
        
        for (int i = 0; i < banklmpl.length; i++)
        {  
        	
        	banklmpl[i] = new Banklmpl();
        	banklmpl[i].openAccount();
            
        } 
        
         int choice;  
        do {  
              
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
            System.out.println("Enter your choice: ");  
            choice = s.nextInt();  
                switch (choice) {  
                    case 1:  
                        for (int i = 0; i < banklmpl.length; i++)
                        {  
                        	banklmpl[i].showAccount();  
                        }  
                        break;  
                    case 2:  
                        System.out.print("Enter account no. you want to search: ");  
                        String Account_no = s.next();  
                        boolean found = false;  
                        for (int i = 0; i <banklmpl.length; i++)
                        {  
                            found = banklmpl[i].search(Account_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) 
                        {  
                            System.out.println("..Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("Enter Account no. : ");  
                        Account_no = s.next();  
                        found = false;  
                        for (int i = 0; i < banklmpl.length; i++) 
                        {  
                            found = banklmpl[i].search(Account_no);  
                            if (found)
                            {  
                            	banklmpl[i].deposit();
                            	//banklmpl[i].deposit1();
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("..Account doesn't exist..");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("Enter Account No : ");  
                        Account_no = s.next();  
                        found = false;  
                        for (int i = 0; i < banklmpl.length; i++)
                        {  
                            found = banklmpl[i].search(Account_no);  
                            if (found) {  
                            	banklmpl[i].withDrawl();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println(".. Account doesn't exist..");  
                        }  
                        break;  
                    case 5:  
                        System.out.println("Thank you");  
                        break;  
                }  
            }  
            while (choice != 5);
            
            s.close();
        }  
    }  
	