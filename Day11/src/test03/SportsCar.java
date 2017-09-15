package test03;

public class SportsCar extends Car {
	private boolean turbo;
	
	public SportsCar() {
		super();
		this.turbo = false;
		System.out.println("SportsCar의 매개변수 없는 생성자");
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
		System.out.println("속도:" + getSpeed());
		System.out.println("색상:" + getColor());
		System.out.println("차종:" + getModel());
		System.out.println("터보모드:" + turbo);
	}

}
