package programming6;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		String name;
		String adrress;
		String phoneNumber;
		int x;

		ArrayList<Student> stList = new ArrayList<Student>();

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("<1>�л� ���� �߰�  <2>�˻�   <3>����  <4>����: ");
			x = s.nextInt();

			switch (x) {
			case 1:
				System.out.print("�̸��� �Է��Ͻÿ�: ");
				name = s.next();
				System.out.print("�ּҸ� �Է��Ͻÿ�: ");
				adrress = s.next();
				System.out.print("��ȭ��ȣ�� �Է��Ͻÿ�: ");
				phoneNumber = s.next();
				stList.add(new Student(name, adrress, phoneNumber));
				stList.get(stList.size() - 1).printAccount();
				break;
			case 2:
				System.out.print("ã���ô� �л��� �̸��� �Է��Ͻÿ�: ");
				name = s.next();
				for (int y = 0; y < stList.size(); y++) {
					if (stList.get(y).getName().equals(name)) {
						stList.get(y).printAccount();
					} else if (y == stList.size() - 1 && stList.get(y).getName() != name) {
						System.out.println("ã���ô� �л� ������ �����ϴ�.");
					}
				}
				break;
			case 3:
				System.out.print("�����Ͻ� �л� ������ �̸��� �Է��Ͻÿ�: ");
				name = s.next();
				for (int y = 0; y < stList.size(); y++) {
					if (stList.get(y).getName().equals(name)) {
						stList.remove(y);
						System.out.println("�л� ������ ���� �Ǿ����ϴ�.");
					} else if (y == stList.size() - 1 && stList.get(y).getName() != name) {
						System.out.println("ã���ô� �л� ������ �����ϴ�.");
					}
				}
			case 4:
				break;

			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				break;
			}

			if (x == 4) {
				System.out.println("���� �Ǿ����ϴ�.");
				break;
			}
		}
	}
}
