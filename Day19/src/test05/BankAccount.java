package test05;

public class BankAccount {
	private int balance;
	
	synchronized public void deposit(int money) { //synchronized�� �����ϰ������� �̰� ������ �ϴ°�
												 // ������ t1�� �̰� �����Ҷ� 0���� ���¿��� 1000���� ���ϴ���
												// ���� �߿� t2�� �̰� �����ϸ� 1000������ ���°Ծƴ϶� 0������ ���� 1000���� ����
		balance += money;
		if(balance < 0) {
			System.out.println("�ܾ� ���̳ʽ�:" + balance);
		}
		System.out.println("�Ա� �� �ܾ�1:" + balance);
	}
	
	synchronized public void withdraw(int money) {
		balance -= money;
		if(balance < 0) {
			System.out.println("�ܾ� ���̳ʽ�:" + balance);
		}
		System.out.println("�Ա� �� �ܾ�2:" + balance);
	}
}
