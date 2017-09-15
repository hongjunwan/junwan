package test04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

//FileInputStream : ������ �о���̴� �ٽ� ��ü 3
//InputStreamReader : ���� ������ ���ڿ��� ��ȯ�۾� ���� 2 
//BufferedReader : ������ �̵� ���ۿ��� ȿ��������. ������. 1
public class Test {
	public static void main(String[] args) {
		BufferedReader br = null;
//�� ���α׷��� �ݴ�� ���α׷��� �޼����� �޸��� ���Ͽ�
//����ϴ� ���α׷��� �ۼ��� ���ƿ�
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("original.txt")));
			String msg = br.readLine();
			System.out.println("���� �޼���3:" + msg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
