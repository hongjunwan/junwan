package test01;

public class Test01 {
	public static void main(String[] args) {
		
		// �ڹ� ���̺귯���� String�̶�� Ŭ����(���赵)�� �̿���
		// ��ü�� �����ϴ� ����
		
		String msg  = new String("Hello Java Class~!!");
		
		//msg�� ��ü�� �����ؼ�
		//result1�� ��ƿ���
	
		String result1 = msg.toUpperCase(); //toUpperCase �� �빮�ڷ� �ٲٴ�
		
		//� ��������� ���ȭ�鿡 ����ؼ� Ȯ���ϱ�
		System.out.println(result1);
		
		//������ ������ ��ü�� �ٽ� �����ؼ� replace��� �׽�Ʈ�ϱ�
		//H�� T�� �ٲ�
		String result2 = msg.replace('H','T');
		System.out.println(result2);
	}
}
