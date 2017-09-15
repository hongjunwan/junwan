import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		String input;
		int position;
		char c;
		
		Scanner scan = new Scanner(System.in);
		
	    System.out.print("문자열을 입력하시오: ");
	    input = scan.next();
	    
	    System.out.print("문자열에서 대소문자 판별을 원하는 위치 입력: ");
	    position = scan.nextInt();
	    
	    c= input.charAt(position);
	    
	    if(122 >= c && c >= 97){
	    	System.out.println("소문자");
	    }
	    else if(90 >= c && c >= 65){
	    	System.out.println("대문자");
	    }
	    else
	    {
	    	System.out.println("error 알파벳이 아닙니다.");
	    }
	}
}	
