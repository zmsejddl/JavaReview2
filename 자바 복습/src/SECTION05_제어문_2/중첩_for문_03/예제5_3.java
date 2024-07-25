package SECTION05_제어문_2.중첩_for문_03;

public class 예제5_3 {
	public static void main(String[] args) {
		// 중첩 for 문 <구구단 출력하기>

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "X" + j + "=" + (i * j) + "\t");
			}

			System.out.println(); // 단 별로 줄바꿈
		}
		
		/*
		 * 해설
		 * 07: 외부 for 문은 시작 값이 2로 진행됩니다.
		 * 08~10: 내부 for 문은 1에서 9까지 반복하며, 내부 for 문이 반복될 때마다 외부 for 문의 값과 곱하여 출력합니다.
		 * 12: 내부 for 문이 종료된 후 System.out.println()을 수행하여 라인 변경 후 다시 반복합니다.
		 */
	}
}
