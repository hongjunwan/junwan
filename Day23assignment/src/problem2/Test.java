package problem2;

import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CompanyVO com = null;
		CompanyDao dao = new CompanyDao();

		while (true) {
			System.out.print("(1.회사 추가 2.회사 수정 3.회사 삭제 4.회사 검색(회사 이름) 5.회사 검색(회사 ceo) 6.전체 목록 -1.종료)선택하세요:");
			int select = sc.nextInt();

			if (select == -1) {
				break;
			}

			switch (select) {
			case 1: // 추가
				com = new CompanyVO();
				sc.nextLine();
				System.out.print("회사 이름:");
				com.setName(sc.nextLine());
				System.out.print("급여:");
				com.setSalary(sc.nextLine());
				System.out.print("사원 수:");
				com.setPeopleNum(sc.nextInt());
				sc.nextLine();
				System.out.print("기업 구분:");
				com.setDivision(sc.nextLine());
				System.out.print("ceo:");
				com.setCeo(sc.nextLine());

				dao.insertCompany(com);
				break;
			case 2:
				sc.nextLine();
				System.out.print("갱신 할 회사 이름(키 값):");
				String name = sc.nextLine();
				System.out.println("급여(0:갱신 안함):");
				String salary = sc.nextLine();
				System.out.println("사원 수(0:갱신 안함):");
				int peopleNum = sc.nextInt();
				sc.nextLine();
				System.out.println("기업 구분(0:갱신 안함):");
				String division = sc.nextLine();
				System.out.println("ceo(0:갱신 안함):");
				String ceo = sc.nextLine();

				dao.updateCompany(name, salary, peopleNum, division, ceo);
				break;
			case 3:
				sc.nextLine();
				System.out.print("삭제 할 회사 이름을 입력하세요:");
				String name1 = sc.nextLine();
				
				dao.deleteCompany(name1);
				break;
			case 4:
				sc.nextLine();
				System.out.print("회사 이름 검색:");
				String name2 = sc.nextLine();
				
				System.out.println("검색 결과:" + dao.selectCompany(name2));
				break;
			case 5:
				sc.nextLine();
				System.out.print("회사 ceo 검색:");
				String ceo1 = sc.nextLine();
				
				System.out.println("검색 결과:" + dao.selectCompany1(ceo1));
				break;
			case 6:
				dao.totalList();
			}
		}
	}
}
