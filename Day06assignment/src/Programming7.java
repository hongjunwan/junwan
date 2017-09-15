import java.util.Scanner;

public class Programming7 {
	public static void main(String[] args) {

		String id;
		String password;

		Scanner sc = new Scanner(System.in);

		System.out.print("id: ");
		id = sc.next();
		System.out.print("password: ");
		password = sc.next();

		if (id.equalsIgnoreCase("test") && password.equalsIgnoreCase("12asd")) {
			System.out.println("정보가 일치합니다.");
		} else {
			System.out.println("정보가 일치하지 않습니다.");
		}
	}
}
