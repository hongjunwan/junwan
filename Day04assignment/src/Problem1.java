import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {

		int Value1, Value2;
		int Number;
		int Result = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("�� ������ �Է��Ͻÿ�: ");
		Value1 = sc.nextInt();
		Value2 = sc.nextInt();

		System.out.print("1:����, 2:����, 3:����, 4:������, 5:������: ");
		Number = sc.nextInt();

		if (Number == 1) {
			Result = Value1 + Value2;
		} 
		else if (Number == 2) {
			Result = Value1 - Value2;
		} 
		else if (Number == 3) {
			Result = Value1 * Value2;
		} 
		else if (Number == 4) {
			if (Value1 == 0 || Value2 == 0) {
				System.out.println("Incorrect!!");
			} else {
				Result = Value1 / Value2;
			}
		} 
		else if (Number == 5) {
			Result = Value1 % Value2;
		} 
		else {
			System.out.println("Incorrect!!");
		}

		System.out.println("���: " + Result);
	}
}
