import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		
		int number;
		double total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건의 개수를 입력하시오: ");
		number = sc.nextInt();
		
		if(number >= 10){
			total = (number * 100);
			total = total - (total * 0.1);
		}
		else{
			total = number * 100;
		}
		System.out.println("총 가격: " + total);
	}
}
