/*problem1 */
/* ���׿����� ��������
����ڷκ��� ����(int)�� �Է� �޾Ƽ� ����ڰ� �Է��� ������ 50 �̻��̸�
����� ������ A �Դϴ�, 50 �̸��̸� ����� ������ B�Դϴ�. ��� ������
��µǴ� ���α׷��� �ۼ��Ͻÿ�.
<���࿹>
������ �Է��Ͻÿ�:70
����� ������ A�Դϴ�.*/

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		
		int score;
		char grade;
		
		Scanner inputvalue = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		score = inputvalue.nextInt();
		
		grade = (score >= 50)? 'A':'B';
		
		System.out.println("����� ������ " + grade + "�Դϴ�.");	
	}
}
