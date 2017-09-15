package problem2;

public class CompanyVO {
	private String name;
	private String salary;
	private int peopleNum;
	private String division;
	private String ceo;
	/////////////////////////////////////////////////////////
	public CompanyVO() {
		
	}
	
	public CompanyVO(String name, String salary, int peopleNum, String division, String ceo) {
		this.name = name;
		this.salary = salary;
		this.peopleNum = peopleNum;
		this.division = division;
		this.ceo = ceo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getPeopleNum() {
		return peopleNum;
	}

	public void setPeopleNum(int peopleNum) {
		this.peopleNum = peopleNum;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	
	//////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "CompanyVO [name=" + name + ", salary=" + salary + ", peopleNum=" + 
				peopleNum + ", division=" + division + ", ceo=" + ceo + "]";
	}
}
