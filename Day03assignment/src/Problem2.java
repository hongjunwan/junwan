
/*problem2*/
/* ���׿����� ��������2
���� ���� ���α׷��� ������ 70�̻�,40�̻�-70�̸�, 40�̸� �� ������� ������
���� A,B,C�� ������ ����� �ִ� ���α׷��� �ۼ��Ͻÿ�.
(���ǹ� if �Ǵ� switch ��� ����)
<���࿹>
������ �Է��Ͻÿ�:50
����� ������ B�Դϴ�.*/

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {

		int score;
		char grade;

		Scanner inputvalue = new Scanner(System.in);
		
			System.out.print("������ �Է��Ͻÿ�: ");
			score = inputvalue.nextInt();

			grade = (score >= 70) ? 'A' : (score >= 40) ? 'B' : 'C';

			System.out.println("����� ������ " + grade + "�Դϴ�.");
		
	}
}
