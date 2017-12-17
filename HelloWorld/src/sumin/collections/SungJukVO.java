package sumin.collections;

public class SungJukVO {
	
	// 학생성적정보 저장용 클래스
	// 멤버변수, 매개변수생성자, setter/getter, toString까지 정의
	protected String name;
	protected int kor;
	protected int eng;
	protected int mat;
	
	protected int tot;
	


	protected double avrg;
	protected char grd;
	
	public SungJukVO () {
		
	}

	// 소스-필드를 사용하여 생성자 생성
	public SungJukVO(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// 소스-getter 및 setter 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvrg() {
		return avrg;
	}

	public void setAvrg(double avrg) {
		this.avrg = avrg;
	}

	public char getGrd() {
		return grd;
	}

	public void setGrd(char grd) {
		this.grd = grd;
	}
	
	// 소스-generate toString
	@Override
	public String toString() {
		return "SungJukVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	
	
	 
	
	
}
