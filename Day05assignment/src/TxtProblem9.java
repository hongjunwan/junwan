
public class TxtProblem9 {
	public static void main(String[] args) {
		int x = 1;
		int result = 0;

		while (true) {
			result = result + x;

			if (result >= 100) {
				System.out.println("���� 100�̻� �Ǵ� ��° ��: " + x);
				break;
			}
			if(x<0){
				x = (x - 1) * (-1);
			}
			else{
				x = (x + 1) * (-1);
			}
		}
	}
}
