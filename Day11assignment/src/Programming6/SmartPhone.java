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
		osType = "�ȵ���̵�";
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
		return "�ü�� Ÿ��:" + osType + "\n�ü�� ����:" + osVersion + "\n���� �޸� ũ��:" + innerMemorySize + "\nī�޶�:" + cammera
				+ " �������:" + blutooth;
	}

}
