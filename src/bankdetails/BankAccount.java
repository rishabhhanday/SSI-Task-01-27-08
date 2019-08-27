package bankdetails;

public class BankAccount {
	int accNo;
	double balance;
	String accType;
	static double totalWithdraw;
	static double totalDeposit;

	BankAccount() {

	}

	BankAccount(int accNo, double balance, String accType) {
		this.accNo = accNo;
		this.balance = balance;
		this.accType = accType;

	}

	public static void showAverage(BankAccount... ba) {
		double total = 0;
		for (BankAccount b : ba) {
			total = total + b.balance;
		}
		System.out.println("Average is : " + total / ba.length);

	}

	public void setData(int accNo, double balance, String accType) {
		this.accNo = accNo;
		this.balance = balance;
		this.accType = accType;
	}

	public void getData() {
		System.out.println("Your acc no is : " + accNo + " of type :" + accType + " having balance : " + balance + " ");
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		totalWithdraw = totalWithdraw + amount;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		totalDeposit = totalDeposit + amount;
	}

	public static void showTotalDepositeAndWithdraw() {
		System.out.println("Total Deposit = " + totalDeposit + " Total Withdraw = " + totalWithdraw);
	}

	public static void main(String... args) {
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount();
		BankAccount ba3 = new BankAccount();
		//set Data through method
		ba1.setData(1, 200, "Saving");
		ba2.setData(2, 400, "Saving");
		ba3.setData(3, 600, "Saving");
		// print acc details
		ba1.getData();
		ba2.getData();
		ba3.getData();
		 // Withdraw from acc = 1 and acc = 2 amount 100 and 200 respectively and print account details
		System.out.println("Withdraw 100 from account 1");
		ba1.withdraw(100);
		System.out.println("Withdraw 200 from account 2");
		ba2.withdraw(200);
		ba1.getData();
		ba2.getData();
		// deposit from acc = 1 and acc = 2 amount 50 and 100 respectively and print account details
		System.out.println("Deposit 50 in account 1");
		ba1.deposit(50);
		System.out.println("Deposit 100 in account 2");
		ba2.deposit(100);
		ba1.getData();
		ba2.getData();
		//Total Amount withdraw and deposit
		showTotalDepositeAndWithdraw();
		// Average balance of all accounts
		ba1.getData();
		ba2.getData();
		ba3.getData();
		showAverage(ba1,ba2,ba3);
	}

}
