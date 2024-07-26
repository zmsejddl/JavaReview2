package SECTION06_배열.Arrays_03;

import java.util.Arrays;

public class 예제6_11 {
	public static void main(String[] args) {
		// 새로운 배열을 생성하여 복사

		int[] card = { 1, 6, 4, 5, 3, 2 };
		int[] newCard = new int[card.length];

		// 새로운 배열에 기존 내용 삽입
		for (int i = 0; i < card.length; i++) {
			newCard[i] = card[i];
		}

		System.out.println("card 배열: " + Arrays.toString(card));
		System.out.println("newCard 배열: " + Arrays.toString(newCard));

		/*
		 * 해설
		 * 09: card 배열을 선언합니다.
		 * 08: card 배열을 복사할 배열을 선언합니다.
		 * 13~15: 반복문을 사용해 새로운 배열에 기존 배열 값을 입력합니다.
		 */
	}
}
