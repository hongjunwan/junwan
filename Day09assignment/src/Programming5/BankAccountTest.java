package Programming5;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		BankAccount b1 = new BankAccount("준완", "1231234", 100, 1.2);

		System.out.println("이름: " + b.getName());
		System.out.println("계좌 번호: " + b.getAccount());
		System.out.println("잔액: " + b.getBalance());
		System.out.println("이자율: " + b.getProfit());
		System.out.println("이름: " + b1.getName());
		System.out.println("계좌 번호: " + b1.getAccount());
		System.out.println("잔액: " + b1.getBalance());
		System.out.println("이자율: " + b1.getProfit());
	}
}
