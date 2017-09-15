import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		
		int Value1, Value2;
		int	Quotient;
		int Remainder;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하시오: ");
		Value1 = sc.nextInt();
		Value2 = sc.nextInt();
		
		if(Value2 == 0){
			System.out.println("나누는 수가 0입니다.");
		}
		else
		{
			Quotient = Value1 / Value2;
			Remainder = Value1 % Value2;
			System.out.println("몫: " + Quotient + " 나머지: " + Remainder);
		}
	}
}
