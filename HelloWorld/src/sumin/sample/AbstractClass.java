package sumin.sample;

public class AbstractClass {

	public static void main(String[] args) {
		// 일반 클래스는 객체화가 가능
		Finished f = new Finished();

		// 추상클래스는 객체화가 되지 않음
		// Unfinished uf = new Unfinished();

		// 추상클래스는 상속을 통해 객체화 가능
		NewOne no = new NewOne();
	}

}

// 완성된 클래스
class Finished {

}

// 추상 클래스
abstract class Unfinished {
	String name; // 멤버변수

	public void sayHello() {
	} // 메서드

	public abstract void sayHello(String msg);
	// 추상메서드 - 메서드 몸체가 없음
}

class NewOne extends Unfinished {
	@Override // 추상메서드를 재정의
	public void sayHello(String msg) {

	}
}