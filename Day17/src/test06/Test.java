package test06;

public class Test {
//  public static void main(String[] args) {
//      Car myCar = new Car(400, "RED");
//      
//      try {
//          myCar.speedUp();
//      }catch(Exception ex) {
//          System.out.println("속도가 너무 빠릅니다.");
//      }
//      
//      System.out.println("이 문장 실행됨 ???");
//  }
     
    public static void main(String[] args) throws SpeedTooHighException{
        Car myCar = new Car(400, "RED");
 
        myCar.speedUp();
 
        System.out.println("이 문장 실행됨 ???");
    }
}