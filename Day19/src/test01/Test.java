package test01;

public class Test {
	public static void main(String[] args) {
		String msg = "���ξ�����";
		
		CountThread t = new CountThread(); //������ ���� //���ο����� ���� �����ϸ� �� ����Ȱ� ���������� �ؿ��� ������ �ȵ�����
										   //������� �̰͵� �����Ű�� �Ʒ� �͵� �����Ų��.
		t.start();

		for (int i = 10; i > 0; i--) {
			System.out.println(msg + ":" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
