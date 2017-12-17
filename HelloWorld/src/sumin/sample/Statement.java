package sumin.sample;

import java.util.Scanner;

public class Statement {
	public static void main(String[] args) {
		; // 빈문장 ok

		{ // 블록의 시작
			String name;
			int Kor;
			int Eng;
			int Mat;
		} // 블록 끝

		// 문장의 개념 (;으로 끝남)
		int num; // 선언문
		int num2 = 100; // 선언 및 초기화
		String str; // 선언
		// 99 + 98 + 99; // 표현식만으로는 문장성립 안됨
		// 99 + 98 + 99 // 표현식
		num = 99 + 98 + 99;
		++num; // num = num + 1
		System.out.println(num); // 출력문

		{

		} // 빈 블록

		// 변수의 유효범위
		// 블록내 선언한 변수는 기본적으로 지역변수
		// 지역변수는 해당 블록을 벗어나면 사용불가
		// 변수의 유효범위scope를 주의함
		{
			int int1 = 20; // 블록내 변수선언
			++int1; // 사용
		}

		int int2; // 블록 밖 변수선언
		{
			int2 = 55; // 사용
		}

		{
			int int3 = 10;
			{
				int3 = 45;
				int int4 = 50;
				int4 = 90;
			}
			int int4 = 125;// int4 사용가능?? 블록(울타리) 밖 벗어나면 사용 불가
		}
		// int3 =150;

		// 조건문
		int num1 = 3;
		if (num1 > 0) { // 조건식의 결과가 참이면
			System.out.println("0보다 크다큼");
		}
		if (num1 > 0) {

		} else { // 조건식의 결과가 참이 아니면
			System.out.println("0보다 작음");
		}

		// 짝수인지 아닌지 조건문
		num1 = 7;
		if (num1 % 2 == 0) {
			System.out.printf("%d는 짝수입니다%n", num1);
		} else {
			System.out.printf("%d는 홀수입니다%n", num1);
		}

		// 5의 배수인지 여부 확인 조건문
		num1 = 20;
		if (num1 % 5 == 0) {
			System.out.printf("%d은 5의 배수입니다%n", num1);
		} else {
			System.out.printf("%d은 5의 배수가 아닙니다%n", num1);
		}

		// 제어문에서 조건문의 중요성

		if (true) {
			;
			;
		} else
			; // 문장이 하나인경우 {} 는 생략가능

		// 중첩 if 문
		num1 = 55;
		if (num1 % 5 == 0) {
			System.out.println("5배수");
			if (num1 % 10 == 0) {
				System.out.println("10배수");
			} else {
				System.out.println("10배수 아님");
			}
		} else {
			System.out.println("5배수 아님");
		}

		// 아이디, 비밀번호 체크
		// 아이디/비번 일치 - 로그인 성공!
		// 아이디/비번 일치x - 로그인 실패!
		// 아이디: apple, 비밀번호: java
		// userid=="apple" (x)
		// userid.equals("apple") (o)

		// 중첩if문...친절하긴 하나 해커들의 공격?이 있을 수 있어 비추천..가독성도 떨어짐
		String userid = "abc123";
		String passwd = "987xyz";

		if (userid.equals("abc123")) {
			if (passwd.equals("java")) {
				System.out.println("로그인 성공!");
			} else {
				System.out.println("로그인 실패-비밀번호 틀림");
			}
		} else {
			System.out.println("로그인 실패-아이디 틀림");
		}

		// 논리연산자 간결,간단
		if (userid.equals("apple") && passwd.equals("java")) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}

		// 애매모호한 if문 {} 잘 구분해서 써줘야함
		if (num % 5 == 0) {
			if (num % 2 == 0)
				System.out.println("5배수 & 2배수");
		} else {
			System.out.println("5배수 아님");
		}

		// 학점계산
		// 평균 90이상: A
		// 평균 80이상: B
		// 평균 70이상: C
		// 평균 60이상: D
		// 기타: F

		double avg = 95.4;
		char grd = 'F';

		if (avg >= 90) {
			System.out.println('A');
			grd = 'A';
		} else if (avg >= 80) {
			System.out.println('B');
			grd = 'B';
		} else if (avg >= 70) {
			System.out.println('C');
			grd = 'C';
		} else if (avg >= 60) {
			System.out.println('D');
			grd = 'D';
		} else {
			System.out.println('F');
			grd = 'F';
		}

		// switch : 다중 if 문을 세련된 조건식으로 작성
		int num3 = 10;
		switch (num3 % 2) { // 수식의 결과값이 정수
		case 0:
			System.out.println("2의 배수");
			break; // 여기까지만 실행하고, switch 문 밖으로 벗어남
		case 1:
			System.out.println("2의 배수 아님");
			break;
		}

		// double tmp = 1.1;
		// switch (tmp) {
		// } //switch 문의 수식에 double은 사용불가

		// 문자열 형태로도 가능한 switch 문
		String days = "월요일";
		switch (days) {
		case "월요일":
			System.out.println("회사에 출근하는 날...");
			break;
		case "금요일":
			System.out.println("오예! 불타는 금요일!");
			break;
		case "일요일":
			System.out.println("맥주마시며 야구보는 날");
			break;
		}

		// 성적처리
		avg = 96.1;
		grd = 'A';

		switch ((int) avg / 10) { // 정수 수식 또는 문자열 변수 100~90 까지 앞자리수 9... 10으로 나눠주면 9
		case 10:
		case 9:
			grd = 'A';
		case 8:
			grd = 'B';
		case 7:
			grd = 'C';
		case 6:
			grd = 'D';

		default:
			grd = 'F';
			break;
		}
		System.out.printf("학점:%s\n", grd);

		// 반복처리
		// for 문
		// 반복문 내 변수명은 i, j, k, l, m 을 사용 (개발자들의 관례)
		for (int i = 1; i <= 100; ++i) { // 1부터 100까지 1씩 증가
			// 반복실행할 코드
			System.out.println("선생님, 안녕하세요!");
		}

		// 1부터 100사이 짝수만 출력
		for (int j = 2; j <= 100; j += 2) { // 2~100까지 총 99개 중 2씩 증가.. 50번만 돌려서 50개 출력
			System.out.println(j);
		}
		// 또는
		for (int j = 1; j <= 100; ++j) { // 1~100까지 총 100번을 1씩 증가.. 100번 돌리고 50개 출력 (효율성...↓)
			if (j % 2 == 0)
				System.out.println(j);
		}

		// 1부터 500사이 5의 배수 출력
		for (int k = 5; k <= 500; k += 5) {
			System.out.println(k);
		}

		// 무한반복문 - 초기식, 조건식, 증감식을 ; 으로 작성시 ---> 강제종료 시켜야함
		// for (;;) {
		// ;
		// }

		// 반복문에 break, continue 사용하기
		// 반복문 정상 종료 할 때 - 조건식이 거짓일때
		// 반복문 강제 종료 할 때 - break 사용
		// 반복문을 일시적으로 건너뛸 때 - continue 사용

		for (int i = 0; i <= 100; ++i) {
			i = 999; // i 값을 바꿔서 반복실행 종료
			System.out.println(i); // 출력? o
		}

		for (int i = 0; i <= 100; ++i) { // break 때문에 ++1 실행안되니까 dead code
			// break; //밑에 코드 실행하지 않고 바로 for 문 밖으로.. 오류!!
			System.out.println(i); // 출력? x
			break; // 반복실행 중지..밑에다 써야함
		}

		for (int i = 0; i <= 100; ++i) {
			// continue; // 아래문장 실행 안됨. 바로전 단계로 되돌아감. - 오류!
			if (i % 3 != 0)
				continue;
			System.out.println(i); // 출력? 3으로 나누어 떨어지는 값들만 출력됨
		}

		// 중첩 for문
		// 십구구단 중 5단 출력
		// 5 x 1 = 5
		// 5 x 2 = 10
		// 5 x 3 = 15
		// ...
		// 5 x 19= 95

		for (int i = 1; i <= 19; ++i) {
			System.out.printf("5 x %d = %d\n", i, 5 * i);
		}

		// 십구구단 중 14, 15, 16단 출력
		// 14 x 1 = 14 15 x 1 = 15 16 x 1 = 16
		// 14 x 2 = 28 15 x 2 = 30 16 x 2 = 32
		// 14 x 3 = 42 15 x 3 = 45 16 x 3 = 48
		// 14 x 19 = 266 15 x 19 = 285 16 x 19 = 304

		for (int i = 1; i <= 19; ++i) {
			for (int j = 2; j <= 19; ++j) { // 2단부터 19단까지
				System.out.printf("%2d x %2d = %3d \t", j, i, j * i);
			}
			System.out.println();
		}

		// *
		// **
		// ***
		// ****
		// *****

		// *****
		// ****
		// ***
		// **
		// *

		// ----> 중첩 for 문 써서 만들어보기

		// while - 조건에 의해 반복실행
		// while (true) { // 무한루프
		// System.out.println("안녕하세요!");
		// }

		// while (false) { // false 니까 실행할수 없는 반복문
		// System.out.println("이글이 보이나요?");
		// }

		// 1~100 출력
		int i = 1; // 초기화식
		while (i <= 100) { // 조건식
			System.out.println(i);
			++i; // 증감식
		}

		// 1~100 사이 홀수 출력
		int j = 1;
		while (j <= 100) {
			System.out.println(j);
			j += 2;
		}

		// 1~100 사이 5의 배수 출력
		int m1 = 5;
		while (m1 <= 100) {
			System.out.println(m1);
			m1 += 5;
		}

		// 1000부터 1까지 7의 배수 출력
		int k = 1000;
		while (k >= 1) {
			if (k % 7 == 0)
				System.out.println(k);
			--k;
		} // 나머지연산자

		// 위에처럼 아니면 밑에처럼
		int k1 = 994; // 1000에 가까운 7의 배수
		while (k1 >= 1) {
			System.out.println(k1);
			k1 -= 7;
		}

		// while 문에서 break 사용
		// 1~100 사이 짝수 출력
		// 단, 82까지 출력하면 반복문 종료

		int j2 = 2;
		while (j2 <= 100) {
			if (j2 > 82)
				break;// 강제종료

			System.out.println(j2);
			j2 += 2;
		}

		// do-while
		// 1~00 사이 홀수 출력
		int m = 1; // 초기화식
		do {
			System.out.println(m);
			m += 2; // 증가식
		} while (m <= 100); // 조건식

		// scanner를 이용해서 외부입력 처리
		Scanner sc = new Scanner(System.in);
		int month;
		do {
			System.out.println("월을 입력하세요");
			month = sc.nextInt();

			if (month == 0) {
				System.out.println("do-while 종료");
				break;

			}

			System.out.printf("당신은 %d 월을 입력하셨네요!", month);
		} while (month > 1 || month < 12);
		sc.close(); // 키입력 종료 - 자원 해제
	}

}
