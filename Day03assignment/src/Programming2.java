import java.util.Scanner;

public class Programming2 {
	public static void main(String[] args) {
		int first;
		int second;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		first = sc.nextInt();
		
		System.out.print("������ �Է��Ͻÿ�: ");
		second = sc.nextInt();
		
		System.out.println(((first > second) ? first:second) + "�� " + ((first > second) ? second:first) + 
				"���� ���� ���� " + ((first > second) ? first/second : second/first) + "�̰� �������� " + 
				((first > second) ? first%second:second%first) + "�Դϴ�.");	
	}
}
