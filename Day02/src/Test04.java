import java.util.Scanner; //Scanner�� ����ϰڴ�.

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		int result;
		
		System.out.print("ù��° ���� �Է��ϼ���.");
		n1 = sc.nextInt(); // ���Ͱ� �Էµɶ����� ��ٷȴ� �޾ƿ�
		
		System.out.print("�ι�° ���� �Է��ϼ���.");
		n2 = sc.nextInt();
		
		result = n1 + n2;
		System.out.println("���: " + result);
	}
}
