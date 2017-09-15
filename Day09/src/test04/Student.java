package test04;
 
public class Student {
    private String name;
    private String phone;
    private int age;
     
    private static int numOfStudent=0;
//////////////////////////////////////////////////////
    public Student(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
         
        numOfStudent++;
    }
     
    public static int getNumOfStudent() {
        return numOfStudent;
    }
 
    public String toString() {
        String status = 
        "이름:" + name + ", 핸드폰:" + phone + ", 나이:" + age;
        return status;
    }
}