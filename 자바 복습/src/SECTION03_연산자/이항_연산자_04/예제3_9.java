package SECTION03_연산자.이항_연산자_04;

public class 예제3_9 {
	public static void main(String[] args) {
		// 산술 연산자 1

		int x = 100;
		int y = 200;

		System.out.println(x + y); // 100 + 200
		System.out.println(x - y); // 100 - 200
		System.out.println(x * y); // 100 * 200
		System.out.println(x / y); // 100 / 200 정수형의 계산으로 0.5가 아닌 0을 반환
		System.out.println(x % y); // 100 % 200
		
		/*
		 * TIP
		 * 이미 알고 있는 것처럼 *, /, % 연산자가 +, - 연산자보다 우선순위가 높습니다
		 * 덧셈(+), 뺄셈(-) 연산자는 앞에서 학습한 부호 연산자와 같은 기호를 사용하지만 피연산자의 개수에 따라 구별할 수 있습니다
		 */
	}
}
