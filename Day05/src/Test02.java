
public class Test02 {
	public static void main(String[] args) {
		System.out.println("******������ ����******");
		
		for(int dan = 2; dan < 10; dan++){
			System.out.println("************" + dan + "�� ����***********");
			for(int n = 1; n < 10; n++){
				System.out.println(dan + "x" + n + "=" + dan * n);
			}
		}
	}
}
