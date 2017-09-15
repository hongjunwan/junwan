package test06;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		File f = new File("c:/yyj");
		
		if(f.exists() == false) {
			f.mkdirs(); //폴더를 만들어라
			System.out.println("폴더를 생성하였습니다.");
		}else {
			//yyj폴더 안의 파일이름 배열 얻어오기
			String fileNames[] = f.list();
			for(String fileName: fileNames) {
				System.out.println("**파일정보출력**");
				File file = new File("c://yyj/" + fileName);
				System.out.println("전체경로:"+file.getAbsolutePath());
				System.out.println("폴더여부:"+file.isDirectory());
				System.out.println("파일이름:"+file.getName());
				System.out.println("파일크기:"+file.length());
				System.out.println("************************");
			}
		}
	}
}
