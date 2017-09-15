import java.util.Scanner;

public class Programming4 {
	public static void main(String[] args) {
		String[] hexa2bin = { "0000", "0001", "0010", "0011",
							  "0100", "0101", "0110", "0111",
							  "1000", "1001", "1010", "1011",
							  "1100", "1101", "1110", "1111" };
		String text;
		char[] textvalue;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("16���� ���ڿ��� �Է��Ͻÿ�: ");
		text = sc.next();
		
		textvalue = new char[text.length()];

		System.out.print("\"" + text + "\"�� ���� ��������");
		
		for (int x = 0; x < text.length(); x++) {
			textvalue[x] = text.charAt(x);
			
			if(textvalue[x] >= 48 && textvalue[x] <= 57) {
				System.out.print(" " + hexa2bin[textvalue[x]-48]);
			}
			else if(textvalue[x] >= 65 && textvalue[x] <= 70 ) {
				System.out.print(" " + hexa2bin[textvalue[x]-55]);
			}
			else if(textvalue[x] >= 97 && textvalue[x] <= 102) {
				System.out.print(" " + hexa2bin[textvalue[x]-87]);
			}
			else {
				System.out.println(" !!������ �ʰ��Ͽ����ϴ�.!!");
				break;
			}
		}
		System.out.println("�Դϴ�.");
	}
}
