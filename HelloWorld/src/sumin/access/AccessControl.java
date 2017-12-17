package sumin.access;

import sumin.sample.Constructor;
import sumin.sample.SungJukV4;

public class AccessControl {

	private String str1; // 인스턴스 변수
	private static String str2; // 클래스 변수

	public static void main(String[] args) {
		// sumin.sample에 있는 클래스를 호출
		// 접근제어에 따라 접근 가능/불가 확인

		// Human3은 default로 선언되었기 때문에 외부 패키지에서는 접근 할 수 없음
		// sumin.sample.Human3 p1 =
		// new sumin.sample.Human3();

		// import 문을 사용하지 않은 경우 --> 패키지경로.클래스이름
		sumin.sample.Constructor c1 = new sumin.sample.Constructor();

		// import 문을 사용한 경우 --> import 패키지경로.클래스이름();
		Constructor c2 = new Constructor();

		// public 접근제어이므로 접근가능
		SungJukV4 sj = new SungJukV4();
		// default 접근 제어이므로 접근 불가
		// sj.name = "혜교";
		// sj.kor = 99;
		// sj.eng = 98;
		// sj.mat = 99;

		// private 접근 제어이므로 접근 불가
		// sj.tot = 100;
		// sj.avg;
		// sj.grd;

	}

	public static void sayHello(String msg) {
		String hello = "안녕하세요!" + msg;
		// hello = str1 + msg; // 인스턴스 변수는 static(정적) 메서드에서 사용불가
		hello = str2 + msg; // 클래스 변수만 static 메서드에서 사용가능
	}

}
