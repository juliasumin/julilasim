package sumin.sample;

public class Composition {
	public static void main(String[] args) {
		// Has-a 관계 알아보기
		ACircle ac = new ACircle();
		BCircle bc = new BCircle();

		ac.r = 15; // 반지름
		bc.r = 32;

		ac.p.x = 45; // 좌표
		ac.p.y = 12;

		// 모든 클래스의 조상 : Object
		// 따라서, Object 클래스에 정의된
		// toString()이나 equals(Object o)와 같은 메서드가
		// 기본적으로 ...?

	}

}

class Circle {
	// int x; //좌표
	// int y;
	Point p = new Point();
	int r; // 반지름
}

class ACircle extends Circle {

}

class BCircle extends Circle {

}

class Point {
	int x;
	int y;
}