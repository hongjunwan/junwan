import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		
		int Value;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		Value = sc.nextInt();
		
		if(Value % 2 == 0 || Value % 3 == 0 || Value % 5 == 0)
		{
			if(Value % 2 == 0){
				System.out.println("2�� ���");
			}
			if(Value % 3 == 0){
				System.out.println("3�� ���");
			}
			if(Value % 5 == 0){
				System.out.println("5�� ���");
			}
		}
		else{
			System.out.println("2�� ���, 3�� ���, 5�� ����� ������ �ʽ��ϴ�.");
		}		
	}
}
