package Programming2;

public class Test {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer("�����", "����", "102");
		
		System.out.println("c1�� �Ӽ�");
		System.out.println("�̸�: " + c1.getName());
		System.out.println("�ּ�: " + c1.getAdress());
		System.out.println("��ȭ ��ȣ: " + c1.getPhoneNumber());
		System.out.println("�� ��ȣ: " + c1.getCustomerNumber());
		System.out.println("���ϸ���: " + c1.getMileage());
		
		System.out.println("c2�� �Ӽ�");
		System.out.println("�̸�: " + c2.getName());
		System.out.println("�ּ�: " + c2.getAdress());
		System.out.println("��ȭ ��ȣ: " + c2.getPhoneNumber());
		System.out.println("�� ��ȣ: " + c2.getCustomerNumber());
		System.out.println("���ϸ���: " + c2.getMileage());
	}
}
