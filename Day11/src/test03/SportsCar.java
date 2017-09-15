package test03;

public class SportsCar extends Car {
	private boolean turbo;
	
	public SportsCar() {
		super();
		this.turbo = false;
		System.out.println("SportsCar�� �Ű����� ���� ������");
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}

	public boolean isTurbo() {
		return turbo;
	}

	@Override
	public void printCarInfo() {
		super.printCarInfo();
		System.out.println("�ӵ�:" + getSpeed());
		System.out.println("����:" + getColor());
		System.out.println("����:" + getModel());
		System.out.println("�ͺ����:" + turbo);
	}

}
