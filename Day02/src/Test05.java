import java.util.Scanner;

/*���� ���*/

public class Test05 {
	public static void main(String[] args) {
		int salary; //����
		int result; //����
		
		Scanner money = new Scanner(System.in); //���� �Է�, ��� ����ǥ�� ���� ǥ�� �޸� ����
		
		System.out.print("������ �Է� �ϼ���: ");
		salary = money.nextInt();
		
		result = salary * 12 * 10; //10�� ���� ����
		
		System.out.printf("10�⵿���� �������: %d", result); //���ڷθ� �̷������ println�̳� print ,
															  // ���� �� �������� printf
	}
}
