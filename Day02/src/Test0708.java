import java.util.Scanner;

/*원화 달러 변환 프로그램*/

public class Test0708 {
	public static void main(String[] args) {

		int number;
		double money;
		double rate = 1117.7;
		double dollar;

		Scanner inputnum = new Scanner(System.in);

		while (true) {

			System.out.print("1.원화->달러\n2.달러->원화\n3.종료\n원하는 번호를 선택해주세요: ");
			number = inputnum.nextInt();

			if (number == 1) {
				System.out.print("원화를 입력하시오.: ");
				money = inputnum.nextInt();

				dollar = money / rate;

				System.out.println("원화에 대한 달러: " + dollar + "$");
			}

			else if (number == 2) {
				System.out.print("달러를 입력하시오.: ");
				dollar = inputnum.nextInt();

				money = dollar * rate;

				System.out.println("달러에대한 원화: " + money + "원");
			}

			else if (number == 3) {
				System.out.println("종료되었습니다.");
				break;
			}

			else {
				System.out.println("오류!!다시 선택해주십시오.");
			}
		}
	}
}
