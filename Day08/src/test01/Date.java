package test01;
 
public class Date {
    private int year = 2017; // 연도
    private String month = "1월"; // 월
    private int day = 1; // 일
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
            System.out.println("부적합한 day정보 입니다.");
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
     
    // 객체가 저장하는 3개의 정보를 한꺼번에 프린트하는 메소드
    public void printDate() {
        System.out.println(year + "-" + month + "-" + day);
    }
}