package test01;

import java.util.Calendar;
import java.util.Date;

public class Test3 {
	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now);
		
//		System.out.println("���� �⵵:" + (now.getYear() + 1900));
//		System.out.println("���� ��:" + now.getMonth());
//		System.out.println("���� ��:" + now.getDay());
		Calendar c = Calendar.getInstance();
		System.out.println("���� �⵵:" + c.get(Calendar.YEAR));
		System.out.println("���� ��:" + (c.get(Calendar.MONTH)+1)); //�迭�� ����ϱ� ������ 0���� ����
															 //�׷��� �� ������ 1�۰� ���� �׷��� +1 �߰�
		System.out.println("���� ��:" + c.get(Calendar.DAY_OF_MONTH));
		
	}
}
