import java.util.Scanner;

/*�޷�->��ȭ*/

public class Test08 {
	public static void main(String[] args) {
		
		double money;
		double rate = 1117.7;
		int dollar;
		
		Scanner inputmoney = new Scanner(System.in);
		
		
		System.out.print("�޷��� �Է��Ͻÿ�.: ");
		dollar = inputmoney.nextInt();
		
		money = dollar * rate;
		
		System.out.println("�޷������� ��ȭ: " + money + "��");				
	}
}
