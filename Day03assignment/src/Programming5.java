import java.util.Scanner;

public class Programming5 {
	public static void main(String[] args) {
		int length, width, height;
		int volume;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��Ͻÿ�: ");
		length = sc.nextInt();
		System.out.print("�ʺ� �Է��Ͻÿ�: ");
		width = sc.nextInt();
		System.out.print("���̸� �Է��Ͻÿ�: ");
		height = sc.nextInt();
		
		volume = length * width * height;
		
		System.out.println("����: " + ((length<=100 && width<=100 && height<=100)? volume : "error �޸� ũ�� �ʰ�"));
	}
}
