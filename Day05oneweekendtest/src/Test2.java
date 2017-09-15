import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		int inputsecond, second, minute, hour;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간을 입력하시오(초 단위):" );
		inputsecond = sc.nextInt();
		
		second = inputsecond % 60;
		minute = (inputsecond / 60) % 60;
		hour = inputsecond / 3600;
		
		if(minute == 0 && hour != 0){
			System.out.println(hour + "시간 " + second + "초");
		}
		else if(minute !=0 && hour == 0){
			System.out.println(minute + "분 " + second + "초");
		}
		else if(minute == 0 && hour == 0){
			System.out.println(second + "초");
		}
		else{
			System.out.println(hour + "시간 " + minute + "분 " + second + "초");
		}
	}
}
