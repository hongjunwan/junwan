package test05;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//FileInputStream : ������ �о���̴� �ٽ� ��ü 3
//InputStreamReader : ���� ������ ���ڿ��� ��ȯ�۾� ���� 2 
//BufferedReader : ������ �̵� ���ۿ��� ȿ��������. ������. 1
public class Test {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		// �� ���α׷��� �ݴ�� ���α׷��� �޼����� �޸��� ���Ͽ�
		// ����ϴ� ���α׷��� �ۼ��� ���ƿ�
		Scanner s = new Scanner(System.in);

		try {
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("original.txt")));
			//���ʿ� ��Ʈ���� �ٲ� 

			System.out.print("���Ͽ� ����� ���� : ");
			String x = s.nextLine();

			bw.write(x);
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
