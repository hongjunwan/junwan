package test05;

public class BankAccount {
	private int balance;
	
	synchronized public void deposit(int money) { //synchronized는 실행하고있으면 이거 못쓰게 하는거
												 // 없으면 t1이 이걸 실행할때 0원인 상태에서 1000원을 더하는중
												// 실행 중에 t2도 이걸 실행하면 1000원으로 보는게아니라 0원으로 보고 1000원을 더함
		balance += money;
		if(balance < 0) {
			System.out.println("잔액 마이너스:" + balance);
		}
		System.out.println("입금 후 잔액1:" + balance);
	}
	
	synchronized public void withdraw(int money) {
		balance -= money;
		if(balance < 0) {
			System.out.println("잔액 마이너스:" + balance);
		}
		System.out.println("입금 후 잔액2:" + balance);
	}
}
