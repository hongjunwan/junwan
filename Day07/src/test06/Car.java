package test06;

public class Car {
		//�������
		int speed=0; //0���� �ʱ�ȭ ���ص� �ڵ����� 0���� ��
		
		//����޼ҵ�
		void speedUp(int s) {
			int localSpeed=0; //���� ���� //0���� �ʱ�ȭ ���ϸ� �ڵ����� �ȵ� ����
			localSpeed += s;
			speed += s;
			System.out.println("local:" + localSpeed + ",speed:" + speed);
		}
}
