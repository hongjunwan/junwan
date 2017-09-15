import java.util.Scanner;

public class Programming3 {
	public static void main(String[] args) {
		int tall;
		int ft;
		double inch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하시오: ");
		tall = sc.nextInt();
		
		inch = tall / 2.54;
		ft = (int)inch / 12;
		inch = inch - ft * 12;
		
		System.out.println(tall + "cm는 " + ft + "피트 " + inch + "인치 입니다." );
	}
}
