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
			out.flush(); // 버퍼 스트림 쓰려면 꼭해야함
			System.out.println("파일 복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("파일 이름 잘못됨. 없는 파일명");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 에러 발생;;");
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close(); // inputstream 반납하고 종료하기
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) { //outputStream 반납하고 종료하기
					e.printStackTrace();
				}
			}
		}

	}
}
