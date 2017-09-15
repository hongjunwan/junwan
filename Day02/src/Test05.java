import java.util.Scanner;

/*연봉 계산*/

public class Test05 {
	public static void main(String[] args) {
		int salary; //월급
		int result; //연봉
		
		Scanner money = new Scanner(System.in); //직접 입력, 노랑 느낌표는 주의 표시 메모리 낭비
		
		System.out.print("월급을 입력 하세요: ");
		salary = money.nextInt();
		
		result = salary * 12 * 10; //10년 연봉 계산식
		
		System.out.printf("10년동안의 저축액은: %d", result); //문자로만 이루어지면 println이나 print ,
															  // 숫자 값 받을때는 printf
	}
}
