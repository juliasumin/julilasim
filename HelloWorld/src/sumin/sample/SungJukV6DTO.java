package sumin.sample;

public class SungJukV6DTO extends SungJukV6VO {
	public SungJukV6DTO() {

	}

	public SungJukV6DTO(String name, int kor, int eng, int mat) {

		// SungJukV6VO의 생성자 호출
		super(name, kor, eng, mat);
	}
}
