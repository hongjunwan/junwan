package test01;

public class Test {
	public static void main(String[] args) {	
		int[] arr; //�迭 ����, �迭��ü ��������
		
		arr = new int[3]; //�迭 ��ü ���� �� �ּ� ���
		
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 34;
		
		int sum = arr[0] + arr[1] + arr[2];
		double avg = (double)sum / 3;
		
		System.out.println("�հ�: " + sum);
		System.out.println("���: " + avg);
		
		
	}
}
