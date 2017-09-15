import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 6) 
				continue;
			if (i == 9)
				break;
			System.out.println("i=" + i);
		}
	}
}