package SECTION05_제어문_2.while문_04;

public class 예제5_5 {
	public static void main(String[] args) {
		// while 문 <1부터 10까지의 합 출력하기>

		int sum = 0;
		int i = 1;

		// i가 10보다 작을 때까지 반복
		while (i <= 10) {
			sum += i; // sum에 i 값을 누적
			i++; // i가 증가
		}

		System.out.println("합: " + sum);
	}
}
