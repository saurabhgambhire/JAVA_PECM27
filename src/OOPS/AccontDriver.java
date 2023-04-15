package OOPS;

import java.util.Scanner;

public class AccontDriver {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name = ");
		String name = sc.next();
		System.out.println("=========================================");
		
		System.out.println("Enter your Account Number = ");
		int accno = sc.nextInt();
		System.out.println("=========================================");
		
		sc.nextLine();
		System.out.println("Enter your IFSC Code  = ");
		String ifsc = sc.nextLine();
		System.out.println("=========================================");
		
		System.out.println("Enter your Eamil = ");
		String email = sc.next();
		System.out.println("=========================================");
		
		System.out.println("Enter your Branch = ");
		String branch = sc.next();
		System.out.println("=========================================");
		
		System.out.println("Set your Pin ");
		int pin = sc.nextInt();
		System.out.println("=========================================");
		
		System.out.println("Enter your Balance = ");
		int balance = sc.nextInt();
		System.out.println("=========================================");
		
		System.out.println("Enter your Bank = ");
		String bank = sc.next();
		System.out.println("=========================================");
		
		Account a = new Account(name ,accno, ifsc, email, branch, pin, balance ,
				bank);
		int n;
		do {
			System.out.println("Enter 1 for to GetBank ");
			System.out.println("---------------------------");
			System.out.println("Enter 2 for to GetName ");
			System.out.println("---------------------------");
			System.out.println("Enter 3 for to GetAcount Number ");
			System.out.println("---------------------------");
			System.out.println("Enter 4 for to Get IFSC ");
			System.out.println("---------------------------");
			System.out.println("Enter 5 for to Get Email  ");
			System.out.println("---------------------------");
			System.out.println("Enter 6 for to Get Branch ");
			System.out.println("---------------------------");
			System.out.println("Enter 7 for to Get Balance ");
			System.out.println("---------------------------");
			System.out.println("Enter 8 for Deposit ");
			System.out.println("---------------------------");
			System.out.println("Enter 9 for Widrawal  ");
			System.out.println("---------------------------");
			System.out.println("Entet -10 to Exit");
			System.out.println("==========================================");
			System.out.println("Enter your choise = ");
			 n = sc.nextInt();
			
			 switch (n) {
			case 1:
				System.out.println(a.getBank());
				System.out.println("=================================");
				
				break;
				
				
			case 2:
				System.out.println(a.getname());
				System.out.println("=================================");
				break;
				
				
			case 3:
				System.out.println(a.getAccno());
				System.out.println("=================================");
				break;
				
				
			case 4:
				System.out.println(a.getIfsc());
				System.out.println("=================================");
				break;
				
				
			case 5:
				System.out.println(a.getMail());
				System.out.println("=================================");
				break;
				
				
			case 6:
				System.out.println(a.getBranch());
				System.out.println("=================================");
				break;
				
			case 7:
				System.out.println("Enter your Account number and Password to get your Balance");
				System.out.println("Enter your Account Number = ");
				Long acc = sc.nextLong();
				System.out.println("Enter your Password = ");
				int pass = sc.nextInt();
				System.out.println(a.getBalance(acc,pass));	
				System.out.println("=================================");
				break;
			
			case 8:
				System.out.println("For deposit Enter your Account Number, Password, Amount you want to deposit ");
				System.out.println("Enter your Account Number = ");
				Long acc1 = sc.nextLong();
				System.out.println("Enter your Password = ");
				int pass1 = sc.nextInt();
				System.out.println("Enter your Amount = ");
				int amt = sc.nextInt();
				
				a.deposit(acc1, pass1, amt);
				System.out.println("=================================");
				
				break;	
				
			case 9:
				System.out.println("For Widraw Amount Enter your Account Number, Password, Amount you want to Widraw  ");
				System.out.println("Enter your Account Number = ");
				Long acc2 = sc.nextLong();
				System.out.println("Enter your Password = ");
				int pass3 = sc.nextInt();
				System.out.println("Enter your Amount = ");
				int amt1 = sc.nextInt();
				a.withdraw(acc2, pass3, amt1);
				System.out.println("=================================");
				
				break;	
				

			default:
				break;
			}
			
		} while (n>0);

	}

}



























