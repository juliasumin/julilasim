package sumin.sample;

/*용도: 자바 기본자료형 알아보기*/
public class Primitive {
	public static void main(String[] args) {
		int num1 = 123; // 정수형 변수 선언
		int num2 = 1111;
		byte num3 = 0b1111; // 2진수 변수(접두사 0b)
		long jumin = 1234561234567L; // long을 의미하는 L

		int result = num1 + num2;
		System.out.println(result);
		result = num2 - num1;
		System.out.println(result);
		result = num2 * num1;
		System.out.println(result);
		result = num1 % num2;
		System.out.println(result);
	}
}
