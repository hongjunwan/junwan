import java.util.Scanner;

public class Programming1 {
	public static void main(String[] args) {
		final int ARR_SIZE = 10;

		int number, rnumber;
		int[] reservation = new int[ARR_SIZE];

		Scanner sc = new Scanner(System.in);

		for (int x = 0; x < ARR_SIZE; x++) { // �迭 �ʱ�ȭ
			reservation[x] = 0;
		}

		while (true) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0) ");
			number = sc.nextInt();

			if (number == 1) {

				System.out.println("������ ���� ���´� ������ �����ϴ�.");
				System.out.println("---------------------------");
				
				System.out.print("�¼� ��ȣ:");
				for (int x = 1; x <= ARR_SIZE; x++) {
					System.out.print(" " + x);
				}
				
				System.out.println();
				System.out.println("---------------------------");
				
				System.out.print("���� ����:");
				for (int x = 0; x < ARR_SIZE; x++) {
					System.out.print(" " + reservation[x]);
				}
				
				System.out.println();
				System.out.print("���° �¼��� �����Ͻðڽ��ϱ�? ");
				rnumber = sc.nextInt();

				reservation[rnumber - 1] = 1;

				System.out.println("����Ǿ����ϴ�.");
				
				System.out.print("���� ���� ����:");
				for (int x = 0; x < ARR_SIZE; x++) {
					System.out.print(" " + reservation[x]);
				}
				System.out.println();
			} 
			else {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}
	}
}
