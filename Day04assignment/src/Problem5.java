import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		int Value1, Value2;
		int Number;
		int Result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("µÎ Á¤¼ö¸¦ ÀÔ·Â ÇÏ½Ã¿À: ");
		Value1 = sc.nextInt();
		Value2 = sc.nextInt();
		
		System.out.print("1:µ¡¼À, 2:»¬¼À, 3:°ö¼À, 4:³ª´°¼À, 5:³ª¸ÓÁö: ");
		Number = sc.nextInt();
		
		switch(Number){
		case 1:
			Result = Value1 + Value2;
			break;
		case 2:
			Result = Value1 - Value2;
			break;
		case 3:
			Result = Value1 * Value2;
			break;
		case 4:
			if(Value2 == 0){
				System.out.println("Incorrect!");
				break;
			}
			else{
				Result = Value1 / Value2;
				break;
			}
		case 5:
			Result = Value1 % Value2;
			break;
		default:
			System.out.println("Incorrect!");
			break;
		}
		System.out.println("°á°ú: " + Result);
	}
}
