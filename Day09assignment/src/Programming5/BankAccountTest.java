package Programming5;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		BankAccount b1 = new BankAccount("�ؿ�", "1231234", 100, 1.2);

		System.out.println("�̸�: " + b.getName());
		System.out.println("���� ��ȣ: " + b.getAccount());
		System.out.println("�ܾ�: " + b.getBalance());
		System.out.println("������: " + b.getProfit());
		System.out.println("�̸�: " + b1.getName());
		System.out.println("���� ��ȣ: " + b1.getAccount());
		System.out.println("�ܾ�: " + b1.getBalance());
		System.out.println("������: " + b1.getProfit());
	}
}
