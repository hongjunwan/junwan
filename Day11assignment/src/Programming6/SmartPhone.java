package Programming6;

public class SmartPhone extends Phone {
	private String osType;
	private String osVersion;
	private String innerMemorySize;
	private String cammera;
	private String blutooth;

	public SmartPhone(String productCompany, int price, String communicationType, String innerMemotySize,
			String cammera, String blutooth) {
		super(productCompany, price, communicationType);
		osType = "안드로이드";
		osVersion = "nuga";
		this.innerMemorySize = innerMemotySize;
		this.cammera = cammera;
		this.blutooth = blutooth;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getInnerMemorySize() {
		return innerMemorySize;
	}

	public void setInnerMemorySize(String innerMemorySize) {
		this.innerMemorySize = innerMemorySize;
	}

	public String getCammera() {
		return cammera;
	}

	public void setCammera(String cammera) {
		this.cammera = cammera;
	}

	public String getBlutooth() {
		return blutooth;
	}

	public void setBlutooth(String blutooth) {
		this.blutooth = blutooth;
	}

	public String toString() {
		super.printInfo();
		return "운영체제 타입:" + osType + "\n운영체제 버전:" + osVersion + "\n내부 메모리 크기:" + innerMemorySize + "\n카메라:" + cammera
				+ " 블루투스:" + blutooth;
	}

}
