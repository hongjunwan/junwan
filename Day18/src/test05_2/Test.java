package test05_2;
 
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
 
public class Test {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
 
        students.put("111", new Student("111", "������", 3.2));
        students.put("222", new Student("222", "������", 4.2));
        students.put("333", new Student("333", "���ƶ�", 3.0));
        students.put("444", new Student("444", "������", 4.4));
 
        // �й��� 111�� �л� ���� ���
        System.out.println(students.get("111"));
 
        // �й��� 111�� �л� ����
        students.remove("111");
 
        // �й��� 111�� �л� ���� ���
        System.out.println(students.get("111"));
         
        // Map�� ����ִ� ��� �л����� ����ϱ�
        System.out.println("--���� ��� �л����� -- ");
        Set<String> stuNums = students.keySet();
        for(String stuNum : stuNums) {
            Student stu = students.get(stuNum);
            System.out.println(stu);
        }
 
    }
}
