package test01;

import java.util.Calendar;
import java.util.Date;

public class Test3 {
	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now);
		
//		System.out.println("현재 년도:" + (now.getYear() + 1900));
//		System.out.println("현재 월:" + now.getMonth());
//		System.out.println("현재 일:" + now.getDay());
		Calendar c = Calendar.getInstance();
		System.out.println("현재 년도:" + c.get(Calendar.YEAR));
		System.out.println("현재 월:" + (c.get(Calendar.MONTH)+1)); //배열을 사용하기 때문에 0부터 시작
															 //그래서 월 정보가 1작게 나옴 그래서 +1 추가
		System.out.println("현재 일:" + c.get(Calendar.DAY_OF_MONTH));
		
	}
}
