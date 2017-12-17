package sumin.sample;

import java.util.Scanner;

/*
 * Scanner 클래스를 이용해서
 * 이름, 국어, 영어, 수학을 입력 받아서
 * 총점, 평균, 학점 계산후 출력
 * 
 * */

public class SungJukV2 {
	public static void main(String[] args) {
		// 변수 선언

		String name;
		int Kor, Eng, Mat;
		int tot;
		double avg;
		char grd;

		// 성적입력받음
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("국어점수를 입력하세요 : ");
		Kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		// Eng = Integer.parseInt(sc.next());
		Eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		Mat = sc.nextInt();
		sc.close();
		// 총점, 평균, 학점 계산
		tot = Kor + Eng + Mat;
		avg = tot / 3.0; // 형변환;
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = '수';
			break;
		case 8:
			grd = '우';
			break;
		case 7:
			grd = '미';
			break;
		case 6:
			grd = '양';
			break;
		default:
			grd = '가';
			break;
		}

		// 결과 출력
		System.out.println("이름\t국어\t영어\t수학");
		System.out.printf("%s\t%d\t%d\t%d\n", name, Kor, Eng, Mat);
		System.out.printf("총점은 %d 입니다", Kor + Eng + Mat);
	}
}
