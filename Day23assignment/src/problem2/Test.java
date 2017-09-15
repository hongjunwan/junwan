package problem2;

import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CompanyVO com = null;
		CompanyDao dao = new CompanyDao();

		while (true) {
			System.out.print("(1.ȸ�� �߰� 2.ȸ�� ���� 3.ȸ�� ���� 4.ȸ�� �˻�(ȸ�� �̸�) 5.ȸ�� �˻�(ȸ�� ceo) 6.��ü ��� -1.����)�����ϼ���:");
			int select = sc.nextInt();

			if (select == -1) {
				break;
			}

			switch (select) {
			case 1: // �߰�
				com = new CompanyVO();
				sc.nextLine();
				System.out.print("ȸ�� �̸�:");
				com.setName(sc.nextLine());
				System.out.print("�޿�:");
				com.setSalary(sc.nextLine());
				System.out.print("��� ��:");
				com.setPeopleNum(sc.nextInt());
				sc.nextLine();
				System.out.print("��� ����:");
				com.setDivision(sc.nextLine());
				System.out.print("ceo:");
				com.setCeo(sc.nextLine());

				dao.insertCompany(com);
				break;
			case 2:
				sc.nextLine();
				System.out.print("���� �� ȸ�� �̸�(Ű ��):");
				String name = sc.nextLine();
				System.out.println("�޿�(0:���� ����):");
				String salary = sc.nextLine();
				System.out.println("��� ��(0:���� ����):");
				int peopleNum = sc.nextInt();
				sc.nextLine();
				System.out.println("��� ����(0:���� ����):");
				String division = sc.nextLine();
				System.out.println("ceo(0:���� ����):");
				String ceo = sc.nextLine();

				dao.updateCompany(name, salary, peopleNum, division, ceo);
				break;
			case 3:
				sc.nextLine();
				System.out.print("���� �� ȸ�� �̸��� �Է��ϼ���:");
				String name1 = sc.nextLine();
				
				dao.deleteCompany(name1);
				break;
			case 4:
				sc.nextLine();
				System.out.print("ȸ�� �̸� �˻�:");
				String name2 = sc.nextLine();
				
				System.out.println("�˻� ���:" + dao.selectCompany(name2));
				break;
			case 5:
				sc.nextLine();
				System.out.print("ȸ�� ceo �˻�:");
				String ceo1 = sc.nextLine();
				
				System.out.println("�˻� ���:" + dao.selectCompany1(ceo1));
				break;
			case 6:
				dao.totalList();
			}
		}
	}
}
