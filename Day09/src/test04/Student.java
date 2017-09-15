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
        "�̸�:" + name + ", �ڵ���:" + phone + ", ����:" + age;
        return status;
    }
}