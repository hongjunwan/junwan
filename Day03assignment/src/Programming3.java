import java.util.Scanner;

public class Programming3 {
	public static void main(String[] args) {
		int tall;
		int ft;
		double inch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��Ͻÿ�: ");
		tall = sc.nextInt();
		
		inch = tall / 2.54;
		ft = (int)inch / 12;
		inch = inch - ft * 12;
		
		System.out.println(tall + "cm�� " + ft + "��Ʈ " + inch + "��ġ �Դϴ�." );
	}
}
