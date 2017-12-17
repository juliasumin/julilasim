package sumin.sample;

import java.util.Random;

public class Arrays {
	public static void main(String[] args) {
		// 학생 1명
		// name, kor, eng, mat

		// 학생 3명
		// name1, kor1, eng1, mat1
		// name2, kor2, eng2, mat2
		// name3, kor3, eng3, mat3

		// 배열선언(자료형 (type)에 []만 붙이면 됨)
		String[] name;
		int[] kor;
		int[] eng;
		int[] mat;

		// String name; ---> 미리 예약하고 호텔가는거처럼 저장공간을 미리 확보해놓음
		// name = "혜교";

		// name = "혜교"; //배열에서는 오류! 데이터가 저장될 공간이 확보되지 않음
		// 배열은 참조형이며 객체이므로 변수 선언시 new 연산자로 메모리 영역을 생성해야 함
		name = new String[3]; // 3명의 이름을 저장할 공간 생성
		kor = new int[3];
		eng = new int[3];
		mat = new int[3];

		// 배열의 크기는 상수(final)로 정의 가능
		final int SJSIZE = 3; // 상수로 선언할때 final.
		int[] tot = new int[SJSIZE];
		double[] avg = new double[SJSIZE];
		char[] grd = new char[SJSIZE];

		// 배열에 데이터 저장
		// 배열의 위치값(index)는 0부터 시작
		name[0] = "혜교"; // 첫번째 name 요소
		name[1] = "지현";
		name[2] = "수지";

		kor[0] = 90;
		kor[1] = 85;
		kor[2] = 70;

		eng[0] = 80;
		eng[1] = 60;
		eng[2] = 75;

		mat[0] = 90;
		mat[1] = 70;
		mat[2] = 85;

		// 배열의 크기 알아보기 : length
		System.out.println(name.length);
		System.out.println(kor.length);
		System.out.println(eng.length);
		System.out.println(mat.length);

		// 배열내 데이터 출력
		System.out.println("학생 #1 : " + name[0]);
		System.out.println("학생 #2 : " + name[1]);
		System.out.println("학생 #3 : " + name[2]);

		// 반복문으로 배열 출력
		for (int i = 0; i <= 2; ++i) {
			System.out.printf("국어 #%d %d \n", i + 1, kor[i]);
		}

		// 초기에 지정해놓은 배열의크기..(바뀔수도있는데 매번 바꿀수없음) .length 쓰고 = 빼기
		for (int i = 0; i < eng.length; ++i) {
			System.out.printf("영어 #%d %d \n", i + 1, eng[i]);
		}

		/*
		 * // = 넣으려면 최대 길이에서 -1 해줘야함 for (int i = 0; i <= mat.length - 1; ++i) {
		 * System.out.printf("수학 #%d %d \n", i + 1, eng[i]); }
		 */

		for (int i = 0; i < SJSIZE; ++i) {
			System.out.printf("수학 #%d %d \n", i + 1, eng[i]);
		}

		/*
		 * int[] age = null; // null은 값이 없다는 것 int age_size = age.length; // new 연산자를
		 * 사용하지 않은 상태에서는 // 배열의 크기 length는 알 수 없음
		 */

		// 배열 초기화
		// 배열 생성시 자동적으로 선언시 타입과 동일하게 기본값이 초기화된다
		// int, double - 0
		// boolean - false
		// String - null
		// 클래스 - null

		int[] intArray = new int[3];
		boolean[] boolArray = new boolean[2];
		String[] strArray = new String[2];
		Person[] person = new Person[100];

		System.out.println("숫자배열 기본값 : " + intArray[0]);
		System.out.println("논리배열 기본값 : " + boolArray[0]);
		System.out.println("문자배열 기본값 : " + strArray[0]);
		System.out.println("객체배열 기본값 : " + person[0]);

		// 명시적 배열 초기화
		String[] userid;
		userid = new String[] { "abc123", "xyz987", "java" };

		String[] passwd = { "123456", "987654", "qweasd", };

		// System.out.println(passwd[3]); // 값이 없어서 오류 뜸
		// 배열의 index가 실제 배열크기보다 크면? 오류 발생 ArrayIndexOutOfBoundsException
		// System.out.println(passwd[4]); // index가 범위를 벗어나서 오류 뜸

		// 배열의 단점
		// 배열의 크기가 한번 결정되면 나중에 크기변경 불가
		// 만일 변경하고 싶다면 배열을 복사해서 처리
		int[] number = new int[100];
		number[99] = 99999;
		// number[100] = 100000; // 오류!
		number = new int[1000];

		// 로또 생성기 - 배열X
		// 1~45 사이 6개의 임의의 숫자 추출, 중복 불가

		int key1, key2, key3, key4, key5, key6;
		Random r = new Random();
		System.out.println(Math.random()); // 이렇게 하려면 수식이 좀 복잡해짐.. *10 하고 /2하고 등등..

		// r.nextInt();
		System.out.println(r.nextInt()); // 아무 정수나 다 나옴
		System.out.println(r.nextInt(45) + 1); // 0~44 범위 안의 랜덤숫자 나오지만 0~44니까 +1

		key1 = r.nextInt(45) + 1;
		key2 = r.nextInt(45) + 1;
		key3 = r.nextInt(45) + 1;
		key4 = r.nextInt(45) + 1;
		key5 = r.nextInt(45) + 1;
		key6 = r.nextInt(45) + 1;

		System.out.printf("%d %d %d %d %d %d \n", key1, key2, key3, key4, key5, key6);

		// 로또 생성기 - 배열O

		int[] key = new int[5];

	}
}

class Person {
}
