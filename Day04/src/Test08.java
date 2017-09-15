import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		int n;
		int i = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 단: ");
		n = sc.nextInt();
		
		while(i<=9){
			System.out.println(n + "x" + i + "=" + n*i);
			i++;
		}
		System.out.println("구구단 종료");
	}
}
