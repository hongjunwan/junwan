import java.util.Scanner;

public class Programming1 {
	public static void main(String[] args) {
		String articlenumber;
		char value;

		Scanner sc = new Scanner(System.in);

		System.out.print("물품 번호를 입력하시오: ");
		articlenumber = sc.next();

		if (articlenumber.length() == 6) {
			System.out.println("올바른 물품 번호 입니다.(크기 6)");
			if ((articlenumber.charAt(0) >= 'A' && articlenumber.charAt(0) <= 'Z'
					|| articlenumber.charAt(0) >= 'a' && articlenumber.charAt(0) <= 'z')
					&& (articlenumber.charAt(1) >= 'A' && articlenumber.charAt(1) <= 'Z'
							|| articlenumber.charAt(1) >= 'a' && articlenumber.charAt(1) <= 'z')) {
				System.out.println("올바른 물품 번호 입니다.(알파벳 맨 앞 2자리)");

				for (int x = 0; x < articlenumber.length() - 2; x++) {
					value = articlenumber.charAt(x + 2);
					if (value < '0' || value > '9') {
						System.out.println("잘못된 물품 번호 입니다.(완료)");
						break;
					} else {
						if (x == 3) {
							System.out.println("올바른 물품 번호 입니다.(숫자 4자리 완료)");
						}
					}
				}

			} else {
				System.out.println("잘못된 물품 번호 입니다.(맨 앞 2자리 오류)");
			}

		} else {
			System.out.println("잘못된 물품 번호 입니다.(길이 오류)");
		}

	}
}
