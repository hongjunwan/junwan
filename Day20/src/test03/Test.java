package test03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("original.txt");
			
			byte[] readByte = new byte[1024];
			String readMsg = "";
			
			while(in.read(readByte) != -1) {
				readMsg += new String(readByte);
			}
			System.out.println("읽은 메세지:" + readMsg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
