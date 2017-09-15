import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
        int year = 2012;
        int month, days = 0;
        
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몇 월 ? ");
		month = scan.nextInt();
		switch(month)
		{
			case 1: case 3: case 5: case 7:
			case 8: case 10: case 12:
				days = 31;
				break;
			case 4: case 6: case 9: case 11:
				days=30;
						break;
			case 2:
				if((year%4==0 && year%100!=0) || (year % 400 == 0)){
					days = 29 ;
					break;
				}
				else{
					days = 28;
				}	
		}
		System.out.println(year + "년 " + month + "월 " + days + "일까지 있습니다.");
	}
}
