import java.util.Scanner;

public class TxtProblem1 {
	public static void main(String[] args) {
		
		int value;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오: ");
		value = sc.nextInt();
		
		for(int x = 1; x <= value; x++){
			if(value % x == 0){
				System.out.print(x + " ");
			}
		}
	}
}
