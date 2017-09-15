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

//FileInputStream : 데이터 읽어들이는 핵심 주체 3
//InputStreamReader : 읽은 데이터 문자열로 변환작업 대행 2 
//BufferedReader : 데이터 이동 버퍼에서 효율적으로. 빠르게. 1
public class Test {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		// 이 프로그램과 반대로 프로그램의 메세지를 메모장 파일에
		// 기록하는 프로그램을 작성해 보아요
		Scanner s = new Scanner(System.in);

		try {
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("original.txt")));
			//안쪽에 스트림만 바뀜 

			System.out.print("파일에 기록할 내용 : ");
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
