import java.util.Scanner;

/*��ȭ �޷� ��ȯ ���α׷�*/

public class Test0708 {
	public static void main(String[] args) {

		int number;
		double money;
		double rate = 1117.7;
		double dollar;

		Scanner inputnum = new Scanner(System.in);

		while (true) {

			System.out.print("1.��ȭ->�޷�\n2.�޷�->��ȭ\n3.����\n���ϴ� ��ȣ�� �������ּ���: ");
			number = inputnum.nextInt();

			if (number == 1) {
				System.out.print("��ȭ�� �Է��Ͻÿ�.: ");
				money = inputnum.nextInt();

				dollar = money / rate;

				System.out.println("��ȭ�� ���� �޷�: " + dollar + "$");
			}

			else if (number == 2) {
				System.out.print("�޷��� �Է��Ͻÿ�.: ");
				dollar = inputnum.nextInt();

				money = dollar * rate;

				System.out.println("�޷������� ��ȭ: " + money + "��");
			}

			else if (number == 3) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}

			else {
				System.out.println("����!!�ٽ� �������ֽʽÿ�.");
			}
		}
	}
}
