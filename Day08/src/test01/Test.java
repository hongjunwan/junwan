package test01;
 
public class Test {
    public static void main(String[] args) {
        Date today = new Date();
         
        today.printDate();
         
//      today.day = 9; private �̶� ���� �Ұ���
        today.setDay(9);
        today.setYear(2011);
        today.setMonth("AUG");
         
        today.printDate();
         
        int y = today.getYear();
        System.out.println("���� ������ �⵵����:"+y);
    }
}