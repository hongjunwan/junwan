import java.util.Scanner;

public class TxtProblem4 {
	public static void main(String[] args) {
		
		int value;
		int temp;
        
		Scanner sc = new Scanner(System.in);

		System.out.print("10�ڸ� �̳��� ������ �Է��Ͻÿ�: ");
		value = sc.nextInt();
		
		System.out.println("���� ���: ");
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
