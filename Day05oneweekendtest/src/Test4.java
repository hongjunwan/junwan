import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		name = sc.next();
		System.out.print("���̸� �Է��Ͻÿ�: ");
		age = sc.nextInt();
		
		System.out.println("\n***ȭ�� ǥ��***");
		System.out.println("�̸�: " + name + "\n����: " + age);
	}
}
