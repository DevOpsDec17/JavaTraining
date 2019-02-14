package Basics;

public class BankAccountMain {

	public static void main(String[] args) {

			BankAccount lakshmyAccount = new BankAccount();
			lakshmyAccount.accountNumber = 12345;
			//lakshmyAccount.balance = 2000.34;
			lakshmyAccount.customerName = "Lakshmy";
			lakshmyAccount.setBalance(1111.11);
			System.out.println(lakshmyAccount.getBalance());
	}

}
