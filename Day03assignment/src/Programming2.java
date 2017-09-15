import java.util.Scanner;

public class Programming2 {
	public static void main(String[] args) {
		int first;
		int second;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		first = sc.nextInt();
		
		System.out.print("정수를 입력하시오: ");
		second = sc.nextInt();
		
		System.out.println(((first > second) ? first:second) + "을 " + ((first > second) ? second:first) + 
				"으로 나눈 몫은 " + ((first > second) ? first/second : second/first) + "이고 나머지는 " + 
				((first > second) ? first%second:second%first) + "입니다.");	
	}
}
