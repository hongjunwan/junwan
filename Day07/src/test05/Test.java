package test05;

public class Test {
	public static void main(String[] args) {
		int size = 5;

		int[] numbers = new int[size];
		
		//�迭�� 10���� 50���� ä��� �; �Ʒ��� ����
		// �ݺ����� �ۼ��� ��� �迭 �ε��� i ����
        // 1���� 5���� ����. ������. ArrayIndexOutOfBounds

		for (int i = 1; i <= size; i++) {
			numbers[i] = (i * 10);
		}
	}
}
