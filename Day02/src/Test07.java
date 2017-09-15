import java.util.Scanner;

/*원화->달러*/

public class Test07 {
	public static void main(String[] args) {
		
		int money;
		double rate = 1117.7;
		double dollar;
		
		Scanner inputmoney = new Scanner(System.in);
		
		
		System.out.print("원화를 입력하시오.: ");
		money = inputmoney.nextInt();
		
		dollar = money / rate;
		
		System.out.println("원화에 대한 달러: " + dollar + "$");
		
		
	}
}
