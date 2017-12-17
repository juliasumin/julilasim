package sumin.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SungJukMain {

	private static StringBuilder displayMenu = null;
	private static List<SungJukVO> sjlist;
	
	static{
		sjlist = new ArrayList<>();
		displayMenu = new StringBuilder();
		displayMenu
		.append("-= 성적처리프로그램 =- \n")
		.append("--------------------\n")
		.append("1: 새로운 성적데이터 추가 \n")
		.append("2: 성적데이터 전체 출력 \n")
		.append("3: 성적데이터 상세 조회\n")
		.append("4: 성적데이터 수정\n")
		.append("5: 성적데이터 삭제\n")
		.append("0: 프로그램 종료\n")
		.append("--------------------\n")
		.append(">> 실행할 작업을 선택하세요 : ");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(displayMenu);
			String menu = sc.nextLine();
			
			switch(menu){
			case "1": addSungJuk(); break;
			case "2": getSungJuk(); break;
			case "3": getSungJuk(); break;
			case "4": ModifySungJuk(); break;
			case "5": RemoveSungJuk(); break;
			case "0": exitSungJuk(); break;
			}
		}

	}


	private static void exitSungJuk() {
		System.exit(0);
		
	}


	private static void RemoveSungJuk() {
		
		
	}


	private static void ModifySungJuk() {
		
		
	}


	private static void getSungJuk() {
		System.out.println("전체 성적 데이터 조회");
		System.out.println("-----------------");
		
		for(int i=0; i<sjlist.size(); ++i){
			System.out.println(sjlist.get(i));
		}
	}


	private static void addSungJuk() {
		System.out.println("새로운 성적 데이터 추가");
		System.out.println("-------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("국어를 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어를 입력하세요");
		int eng = sc.nextInt();
		System.out.println("수학을 입력하세요");
		int mat = sc.nextInt();
		
		//sc.close();
		
		SungJukVO sj = new SungJukVO(name, kor, eng, mat);
		processSungJuk(sj); //총점, 학점, 평균 계산
		
		sjlist.add(sj); // 컬렉션에 성적 추가
	}


	private static void processSungJuk(SungJukVO sj) {
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
		double avrg = tot / 3;
		char grd = '가';
		
		switch((int)avrg / 10) {
		case 10: case 9: grd = '수'; break;
		case 8: grd = '우'; break;
		case 7: grd = '미'; break;
		case 6: grd = '양'; break;
		}
		
		sj.setTot(tot);
		sj.setAvrg(avrg);
		sj.setGrd(grd);
		
		
	}

}
