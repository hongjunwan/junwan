package test06;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		File f = new File("c:/yyj");
		
		if(f.exists() == false) {
			f.mkdirs(); //������ ������
			System.out.println("������ �����Ͽ����ϴ�.");
		}else {
			//yyj���� ���� �����̸� �迭 ������
			String fileNames[] = f.list();
			for(String fileName: fileNames) {
				System.out.println("**�����������**");
				File file = new File("c://yyj/" + fileName);
				System.out.println("��ü���:"+file.getAbsolutePath());
				System.out.println("��������:"+file.isDirectory());
				System.out.println("�����̸�:"+file.getName());
				System.out.println("����ũ��:"+file.length());
				System.out.println("************************");
			}
		}
	}
}
