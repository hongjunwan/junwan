import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		int Value1, Value2;
		int Number;
		int Result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ������ �Է� �Ͻÿ�: ");
		Value1 = sc.nextInt();
		Value2 = sc.nextInt();
		
		System.out.print("1:����, 2:����, 3:����, 4:������, 5:������: ");
		Number = sc.nextInt();
		
		switch(Number){
		case 1:
			Result = Value1 + Value2;
			break;
		case 2:
			Result = Value1 - Value2;
			break;
		case 3:
			Result = Value1 * Value2;
			break;
		case 4:
			if(Value2 == 0){
				System.out.println("Incorrect!");
				break;
			}
			else{
				Result = Value1 / Value2;
				break;
			}
		case 5:
			Result = Value1 % Value2;
			break;
		default:
			System.out.println("Incorrect!");
			break;
		}
		System.out.println("���: " + Result);
	}
}
