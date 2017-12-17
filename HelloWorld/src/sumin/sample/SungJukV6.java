package sumin.sample;

public class SungJukV6 {
	public static void main(String[] args) {
		// SungJukV6VO sj = new SungJukV6VO(); 추상클래스니까 객체생성안됨
		// 성적 데이터 객체 생성
		// 인터페이스를 구현한 클래스의 메서드는 주로 어떤 일을 처리하는 기능을 담당하고 있는 경우가 대부분이므로
		// 객체 생성 없이 사용가능하도록 static으로 정의하는 것이 좋음
		// 모든 DTO객체가 다같이 사용한다는 의미
		// 단, 단점도 존재하는데 프로그램 실행 전 static 관련 메서드를 먼저 JVM 상에 적재하는 과정이 필요함
		// 그에 따른 성능 저하가 발생할 수 있음
		// 많이 쓰면 독이 된다!
		// static에 대한 다른 대안은 싱글톤 패턴을 쓰는것

		SungJukV6DTO sj = new SungJukV6DTO();
		sj.setName("혜교");
		sj.setKor(99);
		sj.setEng(99);
		sj.setMat(99);

		sj = new SungJukV6DTO("혜교", 99, 98, 99);

		// 성적 처리 객체 생성
		SungJukV6Service sjsrv = new SungJukV6Service();
		sjsrv.Total(sj);
		sjsrv.Average(sj);
		sjsrv.Grade(sj);

		// 인터페이스에 선언된 static 메서드 호출
		SungJukV6Impl.sharedTotal(sj);
		SungJukV6Impl.sharedAverage(sj);
		SungJukV6Impl.sharedGrade(sj);

		// 결과출력
		System.out.println(sj.getName());
		System.out.println(sj.getKor());
		System.out.println(sj.getEng());
		System.out.println(sj.getMat());
		System.out.println(sj.getTot());
		System.out.println(sj.getAvg());
		System.out.println(sj.getGrd());

	}
}
