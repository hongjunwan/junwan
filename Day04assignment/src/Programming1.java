import java.util.Scanner;

public class Programming1 {
	public static void main(String[] args) {

		int firstvalue, secondvalue, thirdvalue;
		int temp;

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ�: ");
		firstvalue = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		secondvalue = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
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
		System.out.println("���ĵ� ����: " + firstvalue + " " + secondvalue + " " +  thirdvalue);
	}
}
