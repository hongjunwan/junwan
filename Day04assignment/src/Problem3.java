import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		String input;
		int position;
		char c;
		
		Scanner scan = new Scanner(System.in);
		
	    System.out.print("���ڿ��� �Է��Ͻÿ�: ");
	    input = scan.next();
	    
	    System.out.print("���ڿ����� ��ҹ��� �Ǻ��� ���ϴ� ��ġ �Է�: ");
	    position = scan.nextInt();
	    
	    c= input.charAt(position);
	    
	    if(122 >= c && c >= 97){
	    	System.out.println("�ҹ���");
	    }
	    else if(90 >= c && c >= 65){
	    	System.out.println("�빮��");
	    }
	    else
	    {
	    	System.out.println("error ���ĺ��� �ƴմϴ�.");
	    }
	}
}	
