import java.util.Scanner;

public class Programming4 {
	public static void main(String[] args) {
		double r;
		double height;
		double volume;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�: ");
		r = sc.nextDouble();
		
		System.out.print("������� ���̸� �Է��Ͻÿ�: ");
		height = sc.nextDouble();
		
		volume = r * r * 3.141592 * height;
		
		System.out.println("������� ���Ǵ� " + volume + "�Դϴ�.");	
	}
}
