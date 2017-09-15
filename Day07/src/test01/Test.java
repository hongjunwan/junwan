package test01;

public class Test {
	public static void main(String[] args) {	
		int[] arr; //배열 선언, 배열객체 참조변수
		
		arr = new int[3]; //배열 객체 생성 및 주소 기억
		
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 34;
		
		int sum = arr[0] + arr[1] + arr[2];
		double avg = (double)sum / 3;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		
		
	}
}
