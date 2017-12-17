package sumin.sample;

public class DataType {
	public static void main(String[] args) {
		// 기본 자료형 primitive
		// 정수: int
		int int1 = 21;
		int int2 = 021; // 8진수를 의미하는 접두사 0
		int int3 = 0;
		int int4 = 00; // 8진수

		int int5 = 0x123; // 16진수를 의미하는 접두사 0x (0~F 1~15)
		int int6 = 0xA;
		int int7 = 0x10;
		int int8 = 0xdecafe;
		int int9 = 0x1A2B;
		int int10 = 0x0123;
		int int11 = 0b10101; // 2진수를 의미하는 접두사 b
		int int12 = 0b00011;
		int int13 = 0b10;
		int int14 = 0b000000010;

		int int15 = Integer.MAX_VALUE; // 상수
		int int16 = Integer.MIN_VALUE;

		int a; // 변수 선언
		final int B; // 상수 선언, 이름은 대문자!
		a = 1;
		a = 2;
		a = 3;

		B = 1; // 한번 지정하면 바꿀 수 없음
		// B = 2; //상수이므로 값변경 불가

		// long - 정수보다 더 많은 수를 저장
		long long1 = 0L; // long으로 저장하려면 접미사 L을 써야함
		long long2 = 401L;
		long long3 = -3556L;
		long long4 = 89898L;
		long long5 = -105L;

		long long6 = 25L;
		long long7 = 031L;
		long long8 = 0X19L;
		long long9 = 0b11001L;
		// long long10 = 12345678912345678912L; // 범위초과

		int int17 = 10;
		long long11 = 20;
		long11 = int17; // long(64bit) 변수에 int(32bit) 값 저장
						// 자동 형 변환 - 확대변환

		int int18 = 10;
		long long12 = 2138483655L;
		// int18 = long12; // int(32bit)변수에 long(64bit) 값 저장... 안됨
		// 축소변환 - 불가 (데이터손실)

		int int19 = 5;
		long long13 = 25;
		// int19 = long13; // 불가

		int18 = (int) long12; // 명시적 형 변환 (강제적?)
								// (변환타입) : cast 연산자
		int19 = (int) long13;

		long longmax = Long.MAX_VALUE;
		long longmin = Long.MIN_VALUE;

		// byte
		byte bytemax = Byte.MAX_VALUE;
		byte bytemin = Byte.MIN_VALUE;

		// short
		short shortmax = Short.MAX_VALUE;
		short shortmin = Short.MIN_VALUE;

		// char
		// 문자 하나 저장, '' 를 사용
		char char1 = 'A';
		char char2 = 'a';
		char char3 = '5';
		char char4 = '수';
		char char5 = '?';

		// escape sequence
		// 문자 리터럴로 처리하지 않고
		// 문자 그대로 처리하고 싶을 때 사용
		char char6 = '/';
		char char7 = '\\'; // \하나는 \\써야함 역슬래시..특수기호들

		char char8 = '\n'; // 줄바꿈 new line
		char char9 = '\r'; // 라인피드 (다시 맨앞으로)
		char char10 = '\b'; // beep
		char char11 = '\t'; // 탭문자
		char char12 = '\''; // 작은따옴표
		char char13 = '"'; // 큰따옴표

		// unicode
		// 다국어를 표기하기 위한 문자집합
		char char14 = '\u0041';
		char char15 = '\uAC00';

		// byte + char
		byte byte7 = 10;
		short short6 = 15;
		int int23 = 150;
		long long16 = 20L;
		char char18 = 'A';

		// byte7 = char18; // 형 변환 오류
		byte7 = (byte) char18;
		// char18 = byte7; //형 변환 오류
		char18 = (char) byte7;

		int23 = char18;
		int23 = (int) char18; // 안써도 되지만 명시적으로 써도 됨

		char char19 = 'A';
		int int24 = 65;
		// 아스키코드 0-9 : 48-57
		// 아스키코드 a-z : 97-122
		// 아스키코드 A-Z : 65-90

		char charmax = Character.MAX_VALUE;
		char charmin = Character.MIN_VALUE;

		// boolean - 논리값 저장 (true, false)
		boolean bool1 = true;
		boolean bool2 = false;
		// boolean bool3 = 123;
		// boolean bool4 = 'a';

		// float (정밀도 주의)
		// float 형 리터럴 선언시 접미사 f, F(가독성위해 대문자 추천)
		float float1 = 296 / 3.0f;
		float float2 = 8F;
		float float3 = 8.F;
		float float4 = 8.0F;
		float float5 = 3.14F;

		float floatmax = Float.MAX_VALUE;
		float floatmin = Float.MIN_VALUE;
		float floatInf = Float.POSITIVE_INFINITY;
		float floatNaN = Float.NaN;

		// double (정밀도 주의)
		// doublr 형 리터럴 선언시 접미사 d, D (추천)
		double double1 = 296 / 3.0;
		double double2 = 8D;
		double double3 = 8.D;
		double double4 = 8.0D;

		double doublemax = Double.MAX_VALUE;
		double doublemin = Double.MIN_VALUE;
		double doubleInf = Double.POSITIVE_INFINITY;
		double doubleNaN = Double.NaN;

		// underscore
		// 숫자 표기시 자릿수를 나타내기 위해 사용
		// JDK7 이상부터 지원하기 시작
		int x1 = 1_234;
		int x2 = 1__234;
		// int y2 = _1234; //언더바가 앞이나 뒤에 있으면 안됨
		// int y2 = 1234_;

		System.out.println("int1 = " + int1);
		System.out.println("int2 = " + int2);
		System.out.println("int3 = " + int3);
		System.out.println("int4 = " + int4);
		System.out.println("int5 = " + int5);
		System.out.println("int6 = " + int6);
		System.out.println("int7 = " + int7);
		System.out.println("int8 = " + int8);
		System.out.println("int9 = " + int9);
		System.out.println("int10 = " + int10);
		System.out.println("int11 = " + int11);
		System.out.println("int12 = " + int12);
		System.out.println("int13 = " + int13);
		System.out.println("int14 = " + int14);
		System.out.println("정수최대 = " + int15);
		System.out.println("정수최소 = " + int16);

		System.out.println("short최대 = " + shortmax);
		System.out.println("short최소 = " + shortmin);
		System.out.println("byte최대 = " + bytemax);
		System.out.println("byte최소 = " + bytemin);

		System.out.println("작은따옴표 = " + char12);
		System.out.println("줄바꿈\n\n\n\n\n");
		System.out.println("탭\t탭\t탭\t탭");

		System.out.println(char14);
		System.out.println(char15);

		System.out.println("char 최대 = " + (int) charmax);
		System.out.println("char 최소 = " + (int) charmin);

		System.out.println("A의 int는?" + (int) char19);
		System.out.println("65의 char는?" + (char) int24);

		System.out.println(bool1);
		System.out.println("296/3의 float =" + float1);
		System.out.println("296/3의 double =" + double1);

		System.out.println(x1);
		System.out.println(x2);

		System.out.printf("296/3의 float = %f \n", float1);
		System.out.printf("296/3의 float = %10f \n", float1);
		System.out.printf("296/3의 float = %.2f \n", float1);
	}
}
