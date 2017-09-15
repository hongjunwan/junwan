package test06;
 
public class Car {
    private int speed;
    private String color;
//////////////////////////////////////////////
    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }
     
    public void speedUp() throws SpeedTooHighException{
        if (speed > 300) {
            throw new SpeedTooHighException("속도 최고치 넘는다~~~~~~");
        } else {
            speed += 10;
        }
    }
     
    public void speedDown() {
        speed -= 10;
    }
}