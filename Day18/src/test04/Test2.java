package test04;

import java.util.HashSet;
import java.util.Iterator;

public class Test2 {
	public static void main(String[] args) {
		HashSet<String> words = new HashSet<>();
		
		words.add("�ܾ�");
		words.add("���");
		words.add("�ȳ�");
		words.add("�ܾ�");
		words.add("�ȳ�");
		System.out.println(words); //�� ���� �� ���
		//���� set�� � �����Ͱ� �ִ��� �ϳ��� Ȯ���غ��� ������?
		//�Ʒ��� iterator�� �̿��ϸ� ������ �����͸� �ϳ��� �湮"
		Iterator<String> wordIter = words.iterator();
		
		while(wordIter.hasNext())
			System.out.println("�ϳ��� >> " + wordIter.next());
		
	}
}
