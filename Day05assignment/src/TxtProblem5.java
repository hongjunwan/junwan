import java.util.Scanner;

public class TxtProblem5 {
	public static void main(String[] args) {
		
		int value;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.print("���� �Է��Ͻÿ�: ");
			value = sc.nextInt();
			
			if(value < 0){
				continue;
			}
			
			result = result + value;
			
		}while(value != 0); //0�� �ƴϸ� �ݺ�
		
		System.out.println("��: " + result);
	}
}
