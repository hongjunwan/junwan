import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		int inputsecond, second, minute, hour;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ð��� �Է��Ͻÿ�(�� ����):" );
		inputsecond = sc.nextInt();
		
		second = inputsecond % 60;
		minute = (inputsecond / 60) % 60;
		hour = inputsecond / 3600;
		
		if(minute == 0 && hour != 0){
			System.out.println(hour + "�ð� " + second + "��");
		}
		else if(minute !=0 && hour == 0){
			System.out.println(minute + "�� " + second + "��");
		}
		else if(minute == 0 && hour == 0){
			System.out.println(second + "��");
		}
		else{
			System.out.println(hour + "�ð� " + minute + "�� " + second + "��");
		}
	}
}
