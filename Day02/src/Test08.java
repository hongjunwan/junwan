import java.util.Scanner;

/*달러->원화*/

public class Test08 {
	public static void main(String[] args) {
		
		double money;
		double rate = 1117.7;
		int dollar;
		
		Scanner inputmoney = new Scanner(System.in);
		
		
		System.out.print("달러를 입력하시오.: ");
		dollar = inputmoney.nextInt();
		
		money = dollar * rate;
		
		System.out.println("달러에대한 원화: " + money + "원");				
	}
}
