package sumin.sample;

public class Interface2 {

	public static void main(String[] args) {
		System.out.println(Choices.YES);
		System.out.println(Choices.NO);
		Choices.p.walk();
	}

}

interface Choices {
	// 상수선언
	public static final int YES = 1;
	int NO = 2; // 위에꺼도 이렇게 써도 됨

	// Person12 p12; // 상수를 선언할 때에는 초기화가 반드시 되어야함
	Person12 p = new Person12();
}

interface walkable2 {
	void walk();
}

interface swimable {
	void swim();
}

class Lion implements walkable2 {

	@Override
	public void walk() {

	}

}

// 인터페이스 다중 구현
class Turtle implements walkable2, swimable {

	@Override
	public void swim() {

	}

	@Override
	public void walk() {

	}

}