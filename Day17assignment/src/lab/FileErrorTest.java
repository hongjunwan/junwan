package lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileErrorTest {
	public static void main(String[] args) {
		
		try {
			Scanner in = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("���� ã�� �� ����");
			e.printStackTrace(); //�ܰ������� error ���
		} 
	}
}
