package sumin.sample;

public class SungJukV4 {
	String name;
	int kor;
	int eng;
	int mat;

	private int tot;
	private double avg;
	private char grd;

	public SungJukV4() {
		this("혜교", 99, 98, 99); // 생성자 관련 코드는 언제나 맨 첫줄에!
		// name = "혜교";
		// kor = 99;
		// eng = 98;
		// mat = 99;
	}

	public SungJukV4(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

}
