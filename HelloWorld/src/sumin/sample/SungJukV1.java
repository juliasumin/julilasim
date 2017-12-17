package sumin.sample;

/*
 * 성적처리 프로그램 v1
 * 이름, 국어, 영어, 수학 점수에 대한
 * 총점, 평균을 계산하고 출력*/
public class SungJukV1 {
	public static void main(String[] args) {
		// 변수 선언
		String name;
		int Kor;
		int Eng;
		int Mat;
		int tot;
		double avg;

		// 성적처리
		// 변수 값 대입
		name = "수민";
		Kor = 99;
		Eng = 99;
		Mat = 98;

		// 2.총점, 평균 계산
		tot = Kor + Eng + Mat;
		avg = tot / 3d; // 실수로 평균 내기 위해 3.0이라고 적거나 3d라고 적기 (double)

		// 3.결과출력
		System.out.println(name);
		System.out.println(Kor);
		System.out.println(Eng);
		System.out.println(Mat);
		System.out.println(tot);
		System.out.println(avg);

	}

}
