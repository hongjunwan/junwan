package programming1;

public class Quadrangle implements Movable{
	private int dx;
	private int dy;
	
	@Override
	public void move(int dx, int dy) {
		System.out.println("사각형 기준 점 x:" + this.dx + " y:" + this.dy );
		this.dx = dx;
		this.dy = dy;
		System.out.println("사각형 기준 점 이동 x:" + this.dx + " y:" + this.dy);
	}
}
