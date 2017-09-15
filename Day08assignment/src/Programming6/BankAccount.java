package Programming6;

public class BankAccount {
	int balance;
	private int interestbalance;

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public void withdraw(int amount) {
		if (balance >= 0) {
			balance = balance - amount;
		} else {
			System.out.println("잔고가 -입니다.");
		}
	}

	public void addInterest() {
		interestbalance = balance + (int) (balance * 0.075);
	}

	public int getBalance() {
		return balance;
	}

	public int addBalance() {
		return interestbalance;
	}
	
	public int transfer(int amount, BankAccount otherAccount) {
		if(amount <= balance) {
			balance = balance - amount;
			otherAccount.balance += amount;
		}
		return amount;
		
	}

}
