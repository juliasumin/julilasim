package sumin.sample;

public class Starcraft {

	public static void main(String[] args) {

	}
}

// class Marine {
// int x, y;
//
// void move(int x, int y) { //x,y 만큼 이동
// }
//
// void stop() {
// }
//
// void attack() {
// }
//
// void stimPack() {
// } // 순간적으로 공격력 증강
// }
//
// class Tank {
// int x, y;
//
// void move(int x, int y) { //x*2, y*2 만큼 이동
// }
//
// void stop() {
// }
//
// void attack() {
// }
//
// void changeMode() {
// } // 공격범위 변경
// }
//
// class Dropship {
// int x, y;
//
// void move(int x, int y) { //x*10, y*10 만큼 이동
// }
//
// void stop() {
// }
//
// void load() {
// } // 대상을 태움
//
// void unload() {
// } // 대상을 내림
// }

// 추상클래스
abstract class Unit {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
	};
}

class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("머린은 1m 이동했다!");
	}

	public void stimPack() {
		System.out.println("머린은 5초동안 5배 공격력을 갖는다");
	}

}

class Tank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("시즈탱크는 5m 이동했다");
	}

	public void changeMode() {
		System.out.println("공격범위 10m, 10배 공격력을 갖는다");
	}

}

class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("수송선은 10m 이동했다");
	}

	public void load() {
		System.out.println("대상을 태운다");
	};

	public void unload() {
		System.out.println("대상을 내린다");
	};

}
