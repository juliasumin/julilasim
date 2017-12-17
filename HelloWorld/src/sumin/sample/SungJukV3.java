package sumin.sample;

public class SungJukV3 {
	public static void main(String[] args) {
		Students st1 = new Students();
		Students st2 = new Students();
		Students st3 = new Students();

		st1.name = "혜교";
		st1.Kor = 99;
		st1.Eng = 98;
		st1.Mat = 99;

		st1.total();
		st1.average();
		st1.grade();

		System.out.printf("%s %d %d %d %d %.1f %s", st1.name, st1.Kor, st1.Eng, st1.Mat, st1.tot, st1.avg, st1.grd);

	}
}

class Students { // 이름, 국어, 영어, 수학, 총점, 평균, 학점
	String name;
	int Kor, Eng, Mat;
	int tot;
	double avg;
	char grd;

	// 메서드 정의
	public void total() {
		tot = Kor + Eng + Mat;
	}

	public void average() {
		avg = tot / 3.0;
	}

	public void grade() {
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
	}
}
