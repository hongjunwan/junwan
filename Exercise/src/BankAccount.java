
public class BankAccount {
	private double balance;
	private int acNumber;
	private static int numberOfAccounts = 1000;
	
	public BankAccount(double initialBalance) {
		balance = initialBalance;
		acNumber = numberOfAccounts++;
	}
	public String toString() {
		return "°èÁÂ" + acNumber + " " + balance;
	}
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(100.0);
		BankAccount b2 = new BankAccount(200.0);
		BankAccount b3 = new BankAccount(300.0);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		}
	}
}

