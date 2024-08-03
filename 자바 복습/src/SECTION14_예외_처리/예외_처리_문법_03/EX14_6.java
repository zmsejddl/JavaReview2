package SECTION14_예외_처리.예외_처리_문법_03;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외 처리가 한 개인 경우

public class EX14_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			int[] cards = { 4, 5, 1, 2, 7, 8 };
			System.out.println("몇 번째 카드를 뽑으시겠습니까? >>");

			int cardIndex = scan.nextInt();
			System.out.println("뽑은 카드 번호는: " + cards[cardIndex]);

		} catch (InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다. 숫자만 가능합니다.");
		}

		System.out.println("프로그램 종료");
		scan.close();
	}
	
	/*
	 * 해설
	 * 13: 배열에 숫자를 입력하여 생성합니다.
	 * 14~16: 카드를 뽑을 배열의 위치를 입력합니다. (잘못 입력되었을 경우 19~21행에서 예외 처리 발생)
	 * 17: cardIndex가 배열의 범위를 넘어갈 경우 예외 처리 없이 중단합니다.
	 */
}
