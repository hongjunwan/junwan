import java.util.Scanner;

public class Programming5 {
	public static void main(String[] args) {
		int length, width, height;
		int volume;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("길이를 입력하시오: ");
		length = sc.nextInt();
		System.out.print("너비를 입력하시오: ");
		width = sc.nextInt();
		System.out.print("높이를 입력하시오: ");
		height = sc.nextInt();
		
		volume = length * width * height;
		
		System.out.println("부피: " + ((length<=100 && width<=100 && height<=100)? volume : "error 메모리 크기 초과"));
	}
}
