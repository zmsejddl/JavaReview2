package SECTION14_예외_처리.예외_처리_문법_03;

//예외 처리 1

public class EX14_4 {
	public static void main(String[] args) {
		int result = 0;

		try {
			result = 10 / 0;
			System.out.println("나누기 결과" + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기 할 수 없습니다.");
		}
		System.out.println("프로그램 종료.");
	}

	/*
	 * 해설
	 * 10: 정수 타입은 0으로 나눌 수 없습니다. 해당 부분에서 오류가 발생합니다.
	 * 12~14: 나누기 관련 예외 처리는 ArithmeticException이 발생합니다. 
	 * catch가 파라미터로 받으면 시스템이 발생한 예외를 잡을 수 있습니다.
	 */
}
