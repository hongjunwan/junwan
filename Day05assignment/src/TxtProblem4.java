import java.util.Scanner;

public class TxtProblem4 {
	public static void main(String[] args) {
		
		int value;
		int temp;
        
		Scanner sc = new Scanner(System.in);

		System.out.print("10자리 이내의 정수를 입력하시오: ");
		value = sc.nextInt();
		
		System.out.println("역순 결과: ");
		for(int x = 0; x< 10; x++){
			
			temp = value % 10;
			value = value / 10;
			System.out.print(temp);
			if(value == 0){
				break;
			}
		}
	}
}
