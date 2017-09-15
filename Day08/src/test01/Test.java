package test01;
 
public class Test {
    public static void main(String[] args) {
        Date today = new Date();
         
        today.printDate();
         
//      today.day = 9; private 이라 접근 불가능
        today.setDay(9);
        today.setYear(2011);
        today.setMonth("AUG");
         
        today.printDate();
         
        int y = today.getYear();
        System.out.println("현재 설정된 년도정보:"+y);
    }
}