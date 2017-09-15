
public class Test02 {
	public static void main(String[] args) {
		System.out.println("******구구단 시작******");
		
		for(int dan = 2; dan < 10; dan++){
			System.out.println("************" + dan + "단 시작***********");
			for(int n = 1; n < 10; n++){
				System.out.println(dan + "x" + n + "=" + dan * n);
			}
		}
	}
}
