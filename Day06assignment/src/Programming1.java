import java.util.Scanner;

public class Programming1 {
	public static void main(String[] args) {
		String articlenumber;
		char value;

		Scanner sc = new Scanner(System.in);

		System.out.print("��ǰ ��ȣ�� �Է��Ͻÿ�: ");
		articlenumber = sc.next();

		if (articlenumber.length() == 6) {
			System.out.println("�ùٸ� ��ǰ ��ȣ �Դϴ�.(ũ�� 6)");
			if ((articlenumber.charAt(0) >= 'A' && articlenumber.charAt(0) <= 'Z'
					|| articlenumber.charAt(0) >= 'a' && articlenumber.charAt(0) <= 'z')
					&& (articlenumber.charAt(1) >= 'A' && articlenumber.charAt(1) <= 'Z'
							|| articlenumber.charAt(1) >= 'a' && articlenumber.charAt(1) <= 'z')) {
				System.out.println("�ùٸ� ��ǰ ��ȣ �Դϴ�.(���ĺ� �� �� 2�ڸ�)");

				for (int x = 0; x < articlenumber.length() - 2; x++) {
					value = articlenumber.charAt(x + 2);
					if (value < '0' || value > '9') {
						System.out.println("�߸��� ��ǰ ��ȣ �Դϴ�.(�Ϸ�)");
						break;
					} else {
						if (x == 3) {
							System.out.println("�ùٸ� ��ǰ ��ȣ �Դϴ�.(���� 4�ڸ� �Ϸ�)");
						}
					}
				}

			} else {
				System.out.println("�߸��� ��ǰ ��ȣ �Դϴ�.(�� �� 2�ڸ� ����)");
			}

		} else {
			System.out.println("�߸��� ��ǰ ��ȣ �Դϴ�.(���� ����)");
		}

	}
}
