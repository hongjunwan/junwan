package test01;
 
public class Date {
    private int year = 2017; // ����
    private String month = "1��"; // ��
    private int day = 1; // ��
///////////////////////////////////////////
    public void setYear(int y) {
        year = y;
    }
     
    public void setMonth(String m) {
        month = m;
    }
     
    public void setDay(int d) {
        if(d<=31 && d>=1) {
            day = d;
        }else {
            System.out.println("�������� day���� �Դϴ�.");
        }
    }
     
    public int getYear() {
        return year;
    }
    
    public int getDay() {
    	return day;
    }
    
    public String getMonth() {
    	return month;
    }
     
    // ��ü�� �����ϴ� 3���� ������ �Ѳ����� ����Ʈ�ϴ� �޼ҵ�
    public void printDate() {
        System.out.println(year + "-" + month + "-" + day);
    }
}