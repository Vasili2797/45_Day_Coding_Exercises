package Payments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.File;

public class Account {
	static BufferedReader reader;
	String firstName;
	String lastName;
	String email;
	String password;

	public Account(String firstName, String lastName, String password, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public static void main(String[] args) {
		System.out.println("Hello. Please Enter what you would like to do:");
		System.out.println("Please enter from the following list:\n" + "1)Sign Up\n" + "2)Log into the account\n"
				+ "3)MONEY_TRANSFER_SEND\n" + "4)MONEY_TRANSFER_RECEIVE\n" + "5)WITHDRAW");

		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			System.out.println("You entered: Sign Up");
			registration();
		case 2:
			System.out.println("You entered: Log into the account");
			logIntoAccount();
		case 3:
			System.out.println("You entered: MONEY_TRANSFER_RECEIVE");
		case 4:
			System.out.println("You entered: WITHDRAW");
		}
	}

	private static void registration() {
		boolean found=false;
		String tempUserName="";
		String tempPassword="";
		
		reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter your first name: ");
		try {
			String firstName = reader.readLine();
			
			System.out.println("Please enter your last name: ");
			String lastName = reader.readLine();
			
			System.out.println("please enter a password:");
			String password = reader.readLine();
			
			System.out.println("Please enter your email: ");
			String email = reader.readLine();
			
			Account account = new Account(firstName, lastName, password, email);
			
			if (email == null || password == null) {
				System.out.println("Please enter a valid email/password");
			}else {
				File file = new File("registeredUsers.txt");
				
			}
			System.out.println("Thank you for your patience. Your account has been successfully registered!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void logIntoAccount() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please enter your email: ");
			String email = reader.readLine();
			System.out.println("Please enter your password: ");
			String password = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private int id;
	public Transaction[] transactions;

	public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
		if (accountTo.equals(null)) {
			return;
		} else if (moneyAmount <= 0) {
			return;
		}
		Transaction transaction = new Transaction(null, accountTo, moneyAmount,
				StandardAccountOperations.MONEY_TRANSFER_SEND);
	}

	public void withdrawMoney(double moneyAmount) {
		Transaction transaction = new Transaction(this, null, moneyAmount, StandardAccountOperations.WITHDRAW);
	}

	public Transaction[] getTransactions() {
		return null;
	}

	public static class Transaction {
		Account AccountFrom;
		Account accountTo;
		double moneyAmount;
		StandardAccountOperations operation;

		public Transaction(Account AccountFrom, Account accountTo, double moneyAmount,
				StandardAccountOperations operation) {
			this.AccountFrom = AccountFrom;
			this.accountTo = accountTo;
			this.moneyAmount = moneyAmount;
			this.operation = operation;
		}

		public Account getAccountFrom() {
			return AccountFrom;
		}

		public void setAccountFrom(Account accountFrom) {
			this.AccountFrom = accountFrom;
		}

		public Account getAccountTo() {
			return accountTo;
		}

		public void setAccountTo(Account accountTo) {
			this.accountTo = accountTo;
		}

		public double getMoneyAmount() {
			return moneyAmount;
		}

		public void setMoneyAmount(double moneyAmount) {
			this.moneyAmount = moneyAmount;
		}

		public StandardAccountOperations getOperation() {
			return operation;
		}

		public void setOperation(StandardAccountOperations operation) {
			this.operation = operation;
		}
	}
}
