import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		int x, y, r;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��Ͻÿ�: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x < y){
			temp = y;
			y = x;
			x = temp;
		}
		
		while(y != 0){
			r = x % y;
			x = y;
			y = r;
		}
		
		System.out.println("�ִ� �����: " + x);
	}
}
