package SECTION05_제어문_2.for문_02;

public class 예제5_1 {
	public static void main(String[] args) {
		// for ans 1 <1부터 10까지의 합 출력하기>

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("합: " + sum);
		
		/*
		 * 해설
		 * 07: 1부터 10까지의 합을 저장할 변수 sum을 선언하고 0으로 초기화합니다.
		 * 09: int형 변수 i를 선언하고 1로 초기화합니다.
		 * 변수가 10 이하가 될 때까지(true인 동아) 반복이 이루어지며, 반복이 실행될 때마다 1만크 증가합니다.
		 */
	}
}
