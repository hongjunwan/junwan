package test06;

public class Test {
//  public static void main(String[] args) {
//      Car myCar = new Car(400, "RED");
//      
//      try {
//          myCar.speedUp();
//      }catch(Exception ex) {
//          System.out.println("�ӵ��� �ʹ� �����ϴ�.");
//      }
//      
//      System.out.println("�� ���� ����� ???");
//  }
     
    public static void main(String[] args) throws SpeedTooHighException{
        Car myCar = new Car(400, "RED");
 
        myCar.speedUp();
 
        System.out.println("�� ���� ����� ???");
    }
}