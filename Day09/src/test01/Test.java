package test01;

public class Test {
	public static void main(String[] args) {
		Car c1 = new Car(); //���� 2�� �޼ҵ� 5��
		c1.setModel("Sonata");
		c1.setPrice(3000);
		
		Car c2 = new Car();
		c2.setModel("BMW");
		c2.setPrice(4000);
		
		 if(c1.comparePrice(c2)){
			 System.out.println("������ �����ϴ�.");
		 }
		 else {
			 System.out.println("������ �ٸ��ϴ�.");
		 }

	}
}
