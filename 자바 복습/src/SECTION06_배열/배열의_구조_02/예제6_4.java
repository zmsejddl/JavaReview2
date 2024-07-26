package SECTION06_배열.배열의_구조_02;

public class 예제6_4 {
	public static void main(String[] args) {
		// 배열 값에서 짝수의 합 구하기

		// 10개의 배열을 선언
		int[] numbers = new int[10];

		// 배열에 랜덤 함수를 이용해 값을 입력
		for (int i = 0; i < numbers.length; i++) {
			// 랜덤 함수를 이용해 각 배열 위치에 값을 입력
			numbers[i] = (int) (Math.random() * 30) + 1;
		}

		// 배열 안에서 짝수만 구해서 합 구하기
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}

		// 출력 해보기
		for (int i = 0; i < numbers.length; i++) {
			// numbers 배열의 랜덥 값 출력
			System.out.print(numbers[i] + " ");
		}

		// 줄 바꾸기
		System.out.println();
		System.out.println("배열의 짝수들의 합: " + sum);
		
		/*
		 * 해설
		 * 13: 1에서 30 사이의 특정 값을 랜덤하게 출력해 주는 함수를 이용합니다.
		 * 11, 18, 26: numbers.length는 배열의 길이를 반환합니다. (변경은 할 수 없습니다!)
		 */
	}
}
