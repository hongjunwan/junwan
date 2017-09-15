import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		name = sc.next();
		System.out.print("나이를 입력하시오: ");
		age = sc.nextInt();
		
		System.out.println("\n***화면 표시***");
		System.out.println("이름: " + name + "\n나이: " + age);
	}
}
