package q19;

import java.util.Scanner;

/**
 * This program takes the account information and calls withdraw method
 * when the account holder tries to make a withdrawal.
 */
public class QNineteem {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Name: ");
		
		String name = s.nextLine();
		
//		System.out.println("Enter the Phone Number: ");
//		
//		String phone = s.next();
		
		System.out.println("Enter the Email: ");
		
		String email = s.nextLine();
		
		System.out.println("Enter the Current Balance: ");
		
		double balance = s.nextDouble();
		
		AccountInformation a = new AccountInformation();
		
		a.setName(name);
		a.setEmail(email);
		a.setBalance(balance);
		
		System.out.println("Enter the amount you want to withdraw : ");
		
		double amount = s.nextDouble();
		
		try {
			a.withdraw(amount);
		}catch(InsufficientBalance e){
			e.printStackTrace();
		}finally{
			System.out.println("Thank you for doing Business with us.");
		}
		
		s.close();
	}
}
