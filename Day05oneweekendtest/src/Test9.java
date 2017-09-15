import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		
		int a = 0,b = 1,n;
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 번째 항까지: ");
		number = sc.nextInt();
		
		 System.out.print(a + "," + b );
		
		for(int x = 2; x < number; x++){
			n = a + b;
			a = b;
			b = n;
			System.out.print("," + n);
		}
	}
}
