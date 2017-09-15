import java.util.Scanner;

public class Programming4 {
	public static void main(String[] args) {
		double r;
		double height;
		double volume;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
		r = sc.nextDouble();
		
		System.out.print("원기둥의 높이를 입력하시오: ");
		height = sc.nextDouble();
		
		volume = r * r * 3.141592 * height;
		
		System.out.println("원기둥의 부피는 " + volume + "입니다.");	
	}
}
