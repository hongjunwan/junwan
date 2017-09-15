import java.util.Scanner;

public class Main {
	private static int cntzero = 0;
	private static int cntone = 0;
	
	public static int fibonacci(int n) {
		if (n==0) {
	        cntzero++;
	        return 0;
	    } else if (n==1) {
	        cntone++;
	        return 1;
	    } else {
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}
		
	public static void main(String[] args) {

		int T,N;

		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();

		for (int x = 0; x < T; x++) {
			N = sc.nextInt();
			fibonacci(N);
			System.out.print(cntzero + " " + cntone + "\n");
			cntzero = 0;
			cntone = 0;
		}

	}
}