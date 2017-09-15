package test04;
 
public class Test {
    public static void main(String[] args) {
         
        new Student("홍길동","111111111",30);
        new Student("김아무개","111111111",30);
        new Student("양유진","111111111",30);
         
        System.out.println("학생 수 : "+ Student.getNumOfStudent());
    }
}