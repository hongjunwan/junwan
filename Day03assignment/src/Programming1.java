import java.util.Scanner;

public class Programming1 {
	public static void main(String[] args) {
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		name = sc.next();
		
		System.out.print("����: ");
		age = sc.nextInt();
		
		System.out.println("�̸��� " + name + "�̰� " + "���̴� " + age + "���Դϴ�.");
	}
}
