import java.util.Scanner; //Scanner를 사용하겠다.

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		int result;
		
		System.out.print("첫번째 숫자 입력하세요.");
		n1 = sc.nextInt(); // 엔터가 입력될때까지 기다렸다 받아옴
		
		System.out.print("두번째 숫자 입력하세요.");
		n2 = sc.nextInt();
		
		result = n1 + n2;
		System.out.println("결과: " + result);
	}
}
