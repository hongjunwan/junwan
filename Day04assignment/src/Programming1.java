import java.util.Scanner;

public class Programming1 {
	public static void main(String[] args) {

		int firstvalue, secondvalue, thirdvalue;
		int temp;

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오: ");
		firstvalue = sc.nextInt();
		System.out.print("정수를 입력하시오: ");
		secondvalue = sc.nextInt();
		System.out.print("정수를 입력하시오: ");
		thirdvalue = sc.nextInt();

		if (firstvalue > secondvalue) {
			temp = firstvalue;
			firstvalue = secondvalue;
			secondvalue = temp;
		}
		if (secondvalue > thirdvalue) {
			temp = secondvalue;
			secondvalue = thirdvalue;
			thirdvalue = temp;

			if (firstvalue > secondvalue) {
				temp = firstvalue;
				firstvalue = secondvalue;
				secondvalue = temp;
			}
		}
		System.out.println("정렬된 숫자: " + firstvalue + " " + secondvalue + " " +  thirdvalue);
	}
}
