package lab;

public class BankAccount {
	int balance;
	int interestbalance;

	void deposit(int amount) {
		balance = balance + amount;
	}

	void withdraw(int amount) {
		if (balance >= 0) {
			balance = balance - amount;
		}
		else {
			System.out.println("잔고가 -입니다.");
		}
	}
	
	void addInterest() {
		interestbalance = balance + (int) (balance * 0.075);
	}
	
	int getBalance() {
		return balance;
	}
	
	int addBalance() {
		return interestbalance;
	}

}
