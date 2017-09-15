import java.util.Scanner;

public class TxtProblem5 {
	public static void main(String[] args) {
		
		int value;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.print("수를 입력하시오: ");
			value = sc.nextInt();
			
			if(value < 0){
				continue;
			}
			
			result = result + value;
			
		}while(value != 0); //0이 아니면 반복
		
		System.out.println("합: " + result);
	}
}
