package sumin.sample;

public class Class {

	// 배열 vs 구조체 vs 클래스
	// 배열 : 동일한 자료형의 데이터들을 하나로 묶음
	// 구조체: 서로 다른 자료형의 데이터들을 하나로 묶음
	// 클래스: 서로 다른 자료형의 데이터들과 그것과 관련된 메서드들을 하나로 묶음

	public static void main(String[] args) {
		// 객체 생성
		Human1 song;
		song = new Human1();
		Human1 jeon = new Human1();

		// 객체 다루기
		song.name = "혜교";
		song.gender = '여';
		song.age = 37;

		jeon.name = "지현";
		jeon.gender = '여';
		jeon.age = 35;

		// 객체 출력
		System.out.println(song);
		System.out.println(song.name);
		System.out.println(song.gender);
		System.out.println(song.age);

	}

}

// 클래스 선언
class Human1 {
	// 필드(변수) 선언 - 인스턴스 변수
	String name;
	int age;
	char gender;
}

// 학생 클래스 - 이름, 학번, 국어, 영어, 수학
class Student {
	String name;
	String hakbun;
	int kor;
	int eng;
	int mat;
}

// 쇼핑몰
// 회원member 클래스
// 상품product 클래스
// 주문order 클래스

class Member { // 아이디, 비번, 이름, 이메일, 주소
	String userId;
	String passwd;
	String name;
	String email;
	String addr;
}

class Product { // 상품명, 가격, 카테고리, 재고, 사이즈, 색깔, 상품설명 등..
	String prodName;
	int price;
	String category;
	int qty;
	String size;
}

class Order { // 주문자, 주문상품, 수량, 주문일, 배송지, 총 금액,
	String userId; // Member 클래스
	String prodName; // Product 클래스
	int qty;
	String orderDate;
	String orderDest;
	int orderPrice;
}

// 수강신청
// 학생 college - 이름, 학번, 전공, 주소, 전화번호
class College {
	String stdName;
	String hakbun;
	String field;
	String addr;
	String phone;

}

// 과목 course - 과목명, 담당교수, 강의실, 강의시간, 분류, 정원
class Course {
	String title;
	String profes;
	String roomno;
	String courseTime;
	String category;
	int qty;
}

// 수강 enroll - 이름, 과목명, 수강신청일,
class Enroll {
	String stdName;
	String title;
	String enrollDate;
}
