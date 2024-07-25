package SECTION05_제어문_2.중첩_for문_03;

public class 예제5_4 {
	public static void main(String[] args) {
		// 이등변 삼각형 만들기

		for (int i = 0; i < 7; i++) {
			// 공백이 하나씩 줄어들게 된다.
			for (int j = 0; j < 7 - i; j++) {
				System.out.print(" ");
			}
			// 별 모양은 홀수로 늘어난다.
			for (int k = 0; k < (2 * i) + 1; k++) {
				System.out.print("*");
			}

			// 줄을 바꾼다.
			System.out.println();
		}

		/*
		 * 해설 
		 * 09~11: 공백이 하나씩 줄어듭니다. 
		 * 13~15: 별 모양의 개수는 1, 3, 5, 7...과 같이 홀수로 늘어납니다.
		 */
	}
}
