package programming2;

public class HandGame {
	private int user;
	private int computer;

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public int getComputer() {
		return computer;
	}

	public void setComputer(int computer) {
		this.computer = computer;
	}

	public void goGame() {
		computer = (int) (Math.random() * 2);

		if (computer == 0) {
			System.out.println("��ǻ�ʹ� ������ �����մϴ�.");
		} else if (computer == 1) {
			System.out.println("��ǻ�ʹ� ������ �����մϴ�.");
		} else {
			System.out.println("��ǻ�ʹ� ���� �����մϴ�.");
		}

		if (user == 0) {
			if (computer == 0) {
				System.out.println("�����ϴ�.");
			} else if (computer == 1) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			} else {
				System.out.println("����ڰ� �̰���ϴ�.");
			}
		} else if (user == 1) {
			if (computer == 0) {
				System.out.println("����ڰ� �̰���ϴ�.");
			} else if (computer == 1) {
				System.out.println("�����ϴ�.");
			} else {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
		} else {
			if (computer == 0) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			} else if (computer == 1) {
				System.out.println("����ڰ� �̰���ϴ�.");
			} else {
				System.out.println("�����ϴ�.");
			}
		}
	}
}
