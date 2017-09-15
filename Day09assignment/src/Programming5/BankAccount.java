package Programming5;

public class BankAccount {
	private String name;
	private String account;
	private int balance;
	private double profit;

	public BankAccount() {
		name = "¼Õ´Ô1";
		account = "0123213";
		balance = 100;
		profit = 2.5;
	}

	public BankAccount(String name, String account, int balance, double profit) {
		this.name = name;
		this.account = account;
		this.balance = balance;
		this.profit = profit;
	}

	public String getName() {
		return name;
	}

	public String getAccount() {
		return account;
	}

	public int getBalance() {
		return balance;
	}

	public double getProfit() {
		return profit;
	}
}
