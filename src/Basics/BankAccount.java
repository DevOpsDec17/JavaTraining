package Basics;

public class BankAccount {

	long accountNumber;
	private double balance;
	String customerName;
	private String email;
	private int phoneNumber;
	
	public void BankAccount(){
		this.balance = 3000;
	}
	
	double depositAmount(double amount) {
		
		this.balance += amount;
		return this.balance;
	}
	
	double withdrawFunds(double amount) {
		this.balance -= amount;
		return this.balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
