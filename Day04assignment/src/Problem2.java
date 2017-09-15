import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		
		int Value;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		Value = sc.nextInt();
		
		if(Value % 2 == 0 || Value % 3 == 0 || Value % 5 == 0)
		{
			if(Value % 2 == 0){
				System.out.println("2의 배수");
			}
			if(Value % 3 == 0){
				System.out.println("3의 배수");
			}
			if(Value % 5 == 0){
				System.out.println("5의 배수");
			}
		}
		else{
			System.out.println("2의 배수, 3의 배수, 5의 배수에 속하지 않습니다.");
		}		
	}
}
