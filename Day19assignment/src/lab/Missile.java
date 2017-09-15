package lab;
 
import java.awt.event.KeyEvent;
import java.security.Key;
 
public class Missile extends GraphicObject {
    boolean launched = false;
 
    public Missile(String name) {
        super(name);
        y = -200;
    }
 
    public void update() {
    	if( y == 1000  )
    		launched = false;
        if (launched)
            y -= 10;
        if (y < -100)
            launched = false;
    }
 
    public void keyPressed(KeyEvent event, int x, int y) {
        if (event.getKeyCode() == KeyEvent.VK_SPACE) {
            launched = true;
            this.x = x;
            this.y = y;
        }
    }
}