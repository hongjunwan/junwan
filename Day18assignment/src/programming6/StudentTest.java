package programming6;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		String name;
		String adrress;
		String phoneNumber;
		int x;

		ArrayList<Student> stList = new ArrayList<Student>();

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("<1>학생 정보 추가  <2>검색   <3>삭제  <4>종료: ");
			x = s.nextInt();

			switch (x) {
			case 1:
				System.out.print("이름을 입력하시오: ");
				name = s.next();
				System.out.print("주소를 입력하시오: ");
				adrress = s.next();
				System.out.print("전화번호를 입력하시오: ");
				phoneNumber = s.next();
				stList.add(new Student(name, adrress, phoneNumber));
				stList.get(stList.size() - 1).printAccount();
				break;
			case 2:
				System.out.print("찾으시는 학생의 이름을 입력하시오: ");
				name = s.next();
				for (int y = 0; y < stList.size(); y++) {
					if (stList.get(y).getName().equals(name)) {
						stList.get(y).printAccount();
					} else if (y == stList.size() - 1 && stList.get(y).getName() != name) {
						System.out.println("찾으시는 학생 정보가 없습니다.");
					}
				}
				break;
			case 3:
				System.out.print("삭제하실 학생 정보의 이름을 입력하시오: ");
				name = s.next();
				for (int y = 0; y < stList.size(); y++) {
					if (stList.get(y).getName().equals(name)) {
						stList.remove(y);
						System.out.println("학생 정보가 삭제 되었습니다.");
					} else if (y == stList.size() - 1 && stList.get(y).getName() != name) {
						System.out.println("찾으시는 학생 정보가 없습니다.");
					}
				}
			case 4:
				break;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				break;
			}

			if (x == 4) {
				System.out.println("종료 되었습니다.");
				break;
			}
		}
	}
}
