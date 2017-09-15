package test04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

//FileInputStream : 데이터 읽어들이는 핵심 주체 3
//InputStreamReader : 읽은 데이터 문자열로 변환작업 대행 2 
//BufferedReader : 데이터 이동 버퍼에서 효율적으로. 빠르게. 1
public class Test {
	public static void main(String[] args) {
		BufferedReader br = null;
//이 프로그램과 반대로 프로그램의 메세지를 메모장 파일에
//기록하는 프로그램을 작성해 보아요
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("original.txt")));
			String msg = br.readLine();
			System.out.println("읽은 메세지3:" + msg);
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
