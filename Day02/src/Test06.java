import java.util.Scanner;

/*���� �ѷ� ����*/

public class Test06 {
	public static void main(String[] args) {
		
		double pi = 3.14; //���� ��
		double r; //���� ������
		double round; //�ѷ�
		double width; //����
			
		Scanner inputr = new Scanner(System.in);
		
		System.out.print("�������� �Է��ϼ���: ");
		r = inputr.nextDouble(); //�ڷ����� double�̶� nextDouble
   
		round = 2 * pi * r; //���� �ѷ� ��� ����
		width = pi * r * r; //���� ���� ��� ����
		
		System.out.printf("���� �ѷ���: %f\n", round);
		System.out.printf("���� ���̴�: %f", width);
	}
}
