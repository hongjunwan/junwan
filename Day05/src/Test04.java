import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		int input;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("���ڸ� �Է��ϼ���: ");
			input = sc.nextInt();
			
			if(input == 0)
				break;
		}
		System.out.println("���α׷� ����");
	}
}