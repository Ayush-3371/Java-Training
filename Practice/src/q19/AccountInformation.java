package q19;

/**
 * This class takes the account information and updates the account balance 
 * when any withdrawal is made and throws InsufficientBalance exception 
 * if withdrawal amount is bigger than account balance.
 */
public class AccountInformation {
	private String name;
	//private String contactNumber;
	private String email;
	private double balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
//	public String getContactNumber() {
//		return contactNumber;
//	}
//	public void setContactNumber(String contactNumber) {
//		this.contactNumber = contactNumber;
//	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void withdraw(double amount) throws InsufficientBalance{
		if(amount > balance) {
			throw new InsufficientBalance("You do not have sufficient balance to make this withdrawl.");
		}
		
		else balance -= amount;
	}
	
}
