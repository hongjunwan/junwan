package programming1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Die d = new Die();
		int value;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(d);
		System.out.println("***�ֻ��� �� ����***");
		System.out.print("���� �Է��ϼ���: ");
		value = s.nextInt();
		if(value > 6 || value <1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.(������ 1~6)");
		}
		else {
			System.out.println("***�ֻ��� ������***");
			d.roll();
			System.out.println("���� �� �ֻ��� ���� " + d.getValue() + "�� �Դϴ�.");
		}
	}
}
