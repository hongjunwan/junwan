package lab;
 
public class Enermy extends GraphicObject {
    int dx = -10;
    int dy = -10;
 
    public Enermy(String name) {
        super(name);
        x = 500;
        y = 0;
    }
 
    public void update() {
        x += dx;
        y += dy;
        if (x < 0) {
            dx = +(int) (Math.random() * 10 + 1);
        }
        if (x > 500) {
            dx = -(int) (Math.random() * 10 + 1);
        }
        if (y < 10) {
            dy = +(int) (Math.random() * 10 + 1);
        }
        if (y > 50) {
            dy = -(int) (Math.random() * 10 + 1);
        }
 
    }
}
