package test01;

public class SportsCar extends Car {
	private boolean turbo;

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}

	public boolean isTurbo() {
		return turbo;
	}

	public void printCarInfo() {
		System.out.println("�ӵ�:" + getSpeed());
		System.out.println("����:" + getColor());
		System.out.println("����:" + getModel());
		System.out.println("�ͺ����:" + turbo);
	}

}
