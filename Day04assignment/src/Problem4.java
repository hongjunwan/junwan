import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		
		int Value1, Value2;
		int	Quotient;
		int Remainder;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��Ͻÿ�: ");
		Value1 = sc.nextInt();
		Value2 = sc.nextInt();
		
		if(Value2 == 0){
			System.out.println("������ ���� 0�Դϴ�.");
		}
		else
		{
			Quotient = Value1 / Value2;
			Remainder = Value1 % Value2;
			System.out.println("��: " + Quotient + " ������: " + Remainder);
		}
	}
}
