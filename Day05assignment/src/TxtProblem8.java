import java.util.Scanner;

public class TxtProblem8 {
	public static void main(String[] args) {
		
		int value;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		value = sc.nextInt();
		
		System.out.print("10��ŭ ū �� ���� ���: ");
		
		for(int x = value; x <= value + 10; x++){
			System.out.print(x + " ");
		}
	}
}
