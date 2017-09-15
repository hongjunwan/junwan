package test01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		BufferedInputStream in = null;
		BufferedOutputStream out = null;

		try {
			in = new BufferedInputStream(new FileInputStream("images.jpg"));
			out = new BufferedOutputStream(new FileOutputStream("file_test.jpg"));
			
			int c;
			
			while((c= in.read()) != -1) {
				out.write(c);
			}
			out.flush(); // ���� ��Ʈ�� ������ ���ؾ���
			System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			System.out.println("���� �̸� �߸���. ���� ���ϸ�");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("����� ���� �߻�;;");
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close(); // inputstream �ݳ��ϰ� �����ϱ�
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) { //outputStream �ݳ��ϰ� �����ϱ�
					e.printStackTrace();
				}
			}
		}

	}
}
