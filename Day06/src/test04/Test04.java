package test04;

public class Test04 {
	public static void main(String[] args) {

		// String ��ü�� �ּҸ� ��� �������� sample �����
		String sample;

		// String Ŭ������ ��ü�� �����ؼ� �� �ּ� sample�� ���
		sample = new String("Hello String test~!");

		// String ��ü�� ��� �� charAt �����
		// �������ִ� ���ڿ� ���� ���� 1���� �̾��ִ� ���
		char r1 = sample.charAt(1);
		
		for(int i = 0; i < sample.length(); i++) {
			System.out.println("���� ����: " + sample.charAt(1));
		}

	}
}
