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
			System.out.println("컴퓨터는 가위를 선택합니다.");
		} else if (computer == 1) {
			System.out.println("컴퓨터는 바위를 선택합니다.");
		} else {
			System.out.println("컴퓨터는 보를 선택합니다.");
		}

		if (user == 0) {
			if (computer == 0) {
				System.out.println("비겼습니다.");
			} else if (computer == 1) {
				System.out.println("컴퓨터가 이겼습니다.");
			} else {
				System.out.println("사용자가 이겼습니다.");
			}
		} else if (user == 1) {
			if (computer == 0) {
				System.out.println("사용자가 이겼습니다.");
			} else if (computer == 1) {
				System.out.println("비겼습니다.");
			} else {
				System.out.println("컴퓨터가 이겼습니다.");
			}
		} else {
			if (computer == 0) {
				System.out.println("컴퓨터가 이겼습니다.");
			} else if (computer == 1) {
				System.out.println("사용자가 이겼습니다.");
			} else {
				System.out.println("비겼습니다.");
			}
		}
	}
}
